#!/bin/bash
# a script to stop tracking .class and _trace files
# C.Ladroue

# all the tracked .class
for file in $(git ls-files |grep '\.class$')
do
	echo $file
	git rm --cached $file
done

# all the jave_trace
for file in $(git ls-files |grep 'java\._trace$')
do
#	echo $file
#	git rm --cached $file
done




