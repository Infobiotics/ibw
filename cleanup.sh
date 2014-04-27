#!/bin/bash
# a script to stop tracking generated files 
# C.Ladroue

# all the tracked .class
for file in $(git ls-files |grep '\.class$')
do
	echo $file
	git rm --cached $file
done

# all the /src-gen/ 
for file in $(git ls-files |grep '/src-gen/' | grep -v '\.gitignore$')
do
	echo $file
	git rm --cached $file
done

# all the /xtend-gen/

for file in $(git ls-files |grep '/xtend-gen/' | grep -v '\.gitignore$')
do
	echo $file
	git rm --cached $file
done


# all the generated java in the EMF model

for file in $(git ls-files | grep roadblock.emf.ibl/src | grep '\.java$')
do
	echo $file
	git rm --cached $file
done
