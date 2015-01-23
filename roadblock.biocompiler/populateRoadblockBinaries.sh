#!/bin/bash
# populate all folders in roadblock.bin.XXXXX/resources/atgc
# all folders are deleted prior to population.
# C. Ladroue

pathLinux="../roadblock.bin.linux_x86"
pathLinux64="../roadblock.bin.linux_x86_64"
pathMac="../roadblock.bin.mac_x86"
pathMac64="../roadblock.bin.mac_x86_64"
pathWindows="../roadblock.bin.win_x86"
pathWindows64="../roadblock.bin.win_x86_64"

paths=($pathLinux $pathLinux64 $pathMac $pathMac64 $pathWindows $pathWindows64)


# Create directories
echo "  Recreating directories"
for i in $(seq 0 5)
do
	rm -rf ${paths[$i]}/resources/atgc
	mkdir -p ${paths[$i]}/resources/atgc
	mkdir -p ${paths[$i]}/resources/atgc/resources
done

# Common files
echo "  Copying common files"
for i in $(seq 0 5)
do
	cp atgc.jar ${paths[$i]}/resources/atgc
	cp -rf resources/db ${paths[$i]}/resources/atgc/resources/db
	chmod -R a+w ${paths[$i]}/resources/atgc/resources/db
	cp -rf resources/images ${paths[$i]}/resources/atgc/resources/images
	cp -rf resources/sqlite4java ${paths[$i]}/resources/atgc/resources/sqlite4java
done

# wrappers for atgc
echo "  Wrappers for atgc"
cp atgcWrapper.sh $pathLinux/resources/atgc
cp atgcWrapper.sh $pathLinux64/resources/atgc
cp atgcWrapper.sh $pathMac/resources/atgc
cp atgcWrapper.sh $pathMac64/resources/atgc
cp atgcWrapper.bat $pathWindows/resources/atgc
cp atgcWrapper.bat $pathWindows64/resources/atgc

# RBS calculator
## Binaries from python scripts and NuPACK
pathRBSCalculator="resources/atgc/resources/RBSCalculator"

echo "  RBS calculator"
for i in $(seq 0 5)
do
	rm -rf ${paths[$i]}/resources/atgc/resources/RBSCalculator
done

cp -R resources/RBSCalculatorExecutables/RBSCalculatorLinux $pathLinux/$pathRBSCalculator
cp -R resources/RBSCalculatorExecutables/RBSCalculatorLinux $pathLinux64/$pathRBSCalculator
cp -R resources/RBSCalculatorExecutables/RBSCalculatorMac64 $pathMac/$pathRBSCalculator
cp -R resources/RBSCalculatorExecutables/RBSCalculatorMac64 $pathMac64/$pathRBSCalculator

mkdir $pathWindows/$pathRBSCalculator
mkdir $pathWindows64/$pathRBSCalculator

## fake RBS calculator
cp resources/RBSCalculator/fakeRBSCalculator.py $pathLinux/$pathRBSCalculator
cp resources/RBSCalculator/fakeRBSCalculator.py $pathLinux64/$pathRBSCalculator
cp resources/RBSCalculator/fakeRBSCalculator.py $pathMac/$pathRBSCalculator
cp resources/RBSCalculator/fakeRBSCalculator.py $pathMac64/$pathRBSCalculator
cp resources/RBSCalculator/fakeRBSCalculator.bat $pathWindows/$pathRBSCalculator
cp resources/RBSCalculator/fakeRBSCalculator.bat $pathWindows64/$pathRBSCalculator



# test file
echo "  Test file"
for i in $(seq 0 5)
do
	cp EMFModelForTests.xml ${paths[$i]}/resources/atgc
done
echo " ==="
echo "All done. To test installation, go to the relevant project, then resources/atgc. Run, for example:"
echo "mkdir deleteThis"
echo "./atgcWrapper.sh EMFModelForTests.xml deleteThis compile"
echo ""
echo "The folder 'deleteThis' should contain 3 html files and 1 xml (SBOL) file."
