#!/bin/bash
# wrapper for RBS_Design
#./RBSDesignerWrapper.sh CTAGGTACAGTGCTAGCTtctaga atggtgaatgtgaaaccagtaacgttatacgatgt 1000.25 
# C.Ladroue

cd `dirname $0` 

# export path for nupack
export PATH="$PATH:$(pwd)/nupack3.0.5/bin"    
export NUPACKHOME="$(pwd)/nupack3.0.5"


# run RBS_Design
./Run_RBS_Design $1 $2 $3


# tidy up
rm -rf tmp*
