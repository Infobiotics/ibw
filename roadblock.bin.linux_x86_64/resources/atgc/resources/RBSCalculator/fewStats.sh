#!/bin/bash

for (( i = 0; i < 100; i++ )); do
	for (( rate = 100; rate <= 1000; rate =10*rate )); do
		echo $i $rate
		./Run_RBS_Design.py CTAGGTACAGTGCTAGCTtctaga atggtgaatgtgaaaccagtaacgttatacgatgt $rate >> fewStats.log
		rm -fr tmp*
	done
done

