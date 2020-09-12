#!/bin/bash
# Populate the parts database
# C. Ladroue
rm -f db/partRegistry.db
echo "Creating the Database"
echo "CREATE TABLE partRegistry(ID INTEGER PRIMARY KEY AUTOINCREMENT, Name VARCHAR(50), BiologicalFunction VARCHAR(50), Sequence TEXT, Notes TEXT,Origin TEXT);" | sqlite3 db/partRegistry.db
echo "Adding Roadblock's parts"
cat roadblockParts.sql | sqlite3 db/partRegistry.db
echo "Adding BioFab catalogue"
wget -O biofab.csv "http://io.biofab.org/services/data/parts?collectionid=5&format=csv"
sed -e '1d' -e '/^$/d' biofab.csv >biofabCleaned.csv
while read line
do
	name=$(echo $line|cut -d',' -f3)
	biologicalFunction=$(echo $line |cut -d',' -f2)
	sequence=$(echo $line |cut -d',' -f4)
	echo "INSERT INTO partRegistry VALUES(NULL,'$name','$biologicalFunction','$sequence','','biofab');" |sqlite3 db/partRegistry.db
done < biofabCleaned.csv


#echo "Adding REBase catalogue"
#wget -O rebase.txt "ftp://ftp.neb.com/pub/rebase/genepro.txt"
#sed '1,10d' rebase.txt > rebase2.txt
#while read line
#do
#	name=$(echo $line|cut -f1 -d$)
#	sequence=$(echo $line|cut -f2 -d$ | sed -e 's/[^ACGTN]//g')
#	notes=$(echo $line |cut -f2 -d$)
#	echo "INSERT INTO partRegistry VALUES(NULL,'$name','restrictionenzyme','$sequence','$notes','REBase, ftp://ftp.neb.com/pub/rebase/genepro.txt');" |sqlite3 partRegistry.db
#done < rebase2.txt 
