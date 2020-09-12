#!/bin/bash
# recompile atgc and put the jar in the relevant directories
# run this script everytime ATGC source has changed.
# C. Ladroue

ant -f antBuild.xml

pathLinux="../roadblock.bin.linux_x86"
pathLinux64="../roadblock.bin.linux_x86_64"
pathMac="../roadblock.bin.mac_x86"
pathMac64="../roadblock.bin.mac_x86_64"
pathWindows="../roadblock.bin.win_x86"
pathWindows64="../roadblock.bin.win_x86_64"

paths=($pathLinux $pathLinux64 $pathMac $pathMac64 $pathWindows $pathWindows64)

for i in $(seq 0 5)
do
	cp atgc.jar ${paths[$i]}/resources/atgc
done