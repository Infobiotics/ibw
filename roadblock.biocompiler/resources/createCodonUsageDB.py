#!/usr/bin/python
# get the database of codon usage from http://www.kazusa.or.jp/codon/
# example of query: SELECT CodonUsage.codon, usage,species FROM CodonUsage JOIN CodonTable ON CodonTable.codon=CodonUsage.codon WHERE CodonTable.aminoAcid='Glycine' AND CodonUsage.species LIKE '%w3110%'
# C. Ladroue

import sqlite3
import urllib2
import itertools

# Necessary file: 

# Create the tables
print "Creating tables"

connection = sqlite3.connect('codonUsage.db')
c = connection.cursor()
try:
	c.execute('DROP TABLE CodonUsage')
except:
	None
c.execute('CREATE TABLE CodonUsage (id INTEGER PRIMARY KEY AUTOINCREMENT, codon text, usage int, species text)')

try:
	c.execute('DROP TABLE CodonTable')
except:
	None
c.execute('CREATE TABLE CodonTable (codon string(3), aminoAcid string(20))')


# populate DB

# codon table
print "Populating codon table"
codonTable = {
'Phenylalanine': ['TTT','TTC'], 
'Leucine':['TTA', 'TTG', 'CTT', 'CTC', 'CTA', 'CTG'], 
'Isoleucine':['ATT', 'ATC', 'ATA'],
'Methionine': ['ATG'],
'Valine': ['GTT', 'GTC', 'GTA', 'GTG'],
'Serine': ['TCT', 'TCC', 'TCA', 'TCG', 'AGT', 'AGC'],
'Proline': ['CCT', 'CCC', 'CCA', 'CCG'],
'Threonine': ['ACT', 'ACC', 'ACA', 'ACG'],
'Alanine': ['GCT', 'GCC', 'GCA', 'GCG'],
'Tyrosine': ['TAT', 'TAC'],
'STOP':['TAA', 'TGA', 'TAG'],
'Histidine':['CAT', 'CAC'],
'Glutamine':['CAA', 'CAG'],
'Asparagine': ['AAT', 'AAC'],
'Lysine': ['AAA', 'AAG'],
'Aspartic acid': ['GAT', 'GAC'],
'Glutamic acid': ['GAA', 'GAG'],
'Cysteine': ['TGT', 'TGC'],
'Tryptophan': ['TGG'],
'Arginine': ['CGT', 'CGC', 'CGA', 'CGG', 'AGA', 'AGG'],
'Glycine': ['GGT', 'GGC', 'GGA', 'GGG']
 }

for aminoAcid in codonTable:
	for codon in codonTable[aminoAcid]:
		c.execute('INSERT INTO CodonTable VALUES(?,?)',(codon, aminoAcid))


# Codon usage
print "Populating codon usage"
# from CODON_LABEL
codonList = "CGA CGC CGG CGU AGA AGG CUA CUC CUG CUU UUA UUG UCA UCC UCG UCU AGC AGU ACA ACC ACG ACU CCA CCC CCG CCU GCA GCC GCG GCU GGA GGC GGG GGU GUA GUC GUG GUU AAA AAG AAC AAU CAA CAG CAC CAU GAA GAG GAC GAU UAC UAU UGC UGU UUC UUU AUA AUC AUU AUG UGG UAA UAG UGA"
codonList = codonList.replace('U','T').split(' ')


with open('gbbct.spsum') as f:
	for description, usage in itertools.izip_longest(f, f, fillvalue=''):
		
		species = description.strip().split(':')[1]
		usage = usage.strip().split(' ')
		for k in range(0,len(codonList)):
			c.execute('INSERT INTO CodonUsage VALUES(?,?,?,?)',(None,codonList[k],usage[k],species))

connection.commit()
connection.close()
print "Done."