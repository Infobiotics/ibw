#!/bin/bash

# clear the simulation output directory
rm -rf $1 && mkdir -p $1 &&

# run ngss simulator
cd $1 && 
exec "`dirname $0`/ngss" --emf parser=emf max_time=$2 max_runtime=$3 simulation_algorithm=$4 model_file=$5 data_file=$5 log_interval=$6 runs=$7 seed=$8 output=csv compress=true parallel=true show_progress=false
