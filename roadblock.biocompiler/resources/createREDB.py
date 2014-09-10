#!/usr/bin/python
# get a list of commercially available restriction enzymes from REBase
# create and populate a sqlite database
# example of query: SELECT * FROM RestrictionEnzyme WHERE supplier LIKE '%b%' OR supplier LIKE '%f%'
# C. Ladroue

import re
import sqlite3
import urllib2 

# Download the file in memory
print "Downloading data"
response = urllib2.urlopen('ftp://ftp.neb.com/pub/rebase/bairochc.txt') 
source = response.read().split('\n')

# Create the tables
print "Creating tables"

connection = sqlite3.connect('restrictionEnzymes.db')
c = connection.cursor()
try:
	c.execute('DROP TABLE RestrictionEnzyme')
except:
	None
c.execute('CREATE TABLE RestrictionEnzyme (id INTEGER PRIMARY KEY AUTOINCREMENT, name text, sequence text, cutSite int, supplier text)')

try:
	c.execute('DROP TABLE Suppliers')
except:
	None
c.execute('CREATE TABLE Suppliers (id INTEGER PRIMARY KEY AUTOINCREMENT, supplierID text, name text)')

# populate the suppliers table
print "Populating the suppliers table"
pattern = re.compile("^CC\s*[A-Z]=")
data = [c.execute('INSERT INTO Suppliers VALUES(?,?,?)',[None] + s[2:].strip().split('=')) for s in source if pattern.match(s) ]

# Populate the RE table
print "Populating the restriction enzymes table"
pattern = re.compile("^CR|^ID|^RS")
data = [s[2:].strip() for s in source if pattern.match(s) ]

for k in range(0,len(data),3):
	name = data[k]
	sequence = re.search("([^,]*),",data[k+1]).groups()[0]
	cutSite = re.search("[^,]*,([^,]*);",data[k+1]).groups()[0].strip()
	cutSite = cutSite if cutSite!='?' else 99
	suppliers = data[k+2]
	c.execute('INSERT INTO RestrictionEnzyme VALUES(?,?,?,?,?)',(None,name,sequence,cutSite,suppliers))
	print "Index:" + "ID: " + name + ", sequence: " + sequence  + ",cut site: " + str(cutSite)  + ", Suppliers: ", suppliers

connection.commit()
connection.close()
