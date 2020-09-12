#!/bin/bash
# Download necessary files and call all 3 scripts for building the databases
# Run this script only for generating the databases (partRegistry.db, restrictionEnzymes.db and codonUsage.db)
# C. Ladroue

echo "#############"
echo "Part database"
echo "#############"

./createPartsDB.sh

echo "###########################"
echo "Restriction Enzyme database"
echo "###########################"

./createREDB.py

echo "####################"
echo "Codon usage database"
echo "####################"
rm -f gbbct.spsum.gz gbbct.spsum
wget ftp://ftp.ebi.ac.uk/pub/databases/cutg/gbbct.spsum.gz
gunzip -c gbbct.spsum.gz > gbbct.spsum
./createCodonUsageDB.py
