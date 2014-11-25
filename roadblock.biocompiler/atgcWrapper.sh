#!/bin/bash
# wrapper for biocompiler
# C.Ladroue

cd `dirname $0` 


java -Djava.library.path=resources/sqlite4java -jar atgc.jar $1 resources $2 $3

