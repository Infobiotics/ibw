#!/bin/bash
# uses pyinstaller 
# uses pyinstaller to build a standalone executable of each Python scripts
# Requires:
# . nupack3.0.4.tar.gz
# . RBSCalculatorWrapper.sh (or .bat on windows) for tests
# . pyinstaller installed
#
# C. Ladroue



rm -rf RBSCalculator

mkdir RBSCalculator
cp RBSDesignerWrapper.sh RBSCalculator

# echo "Building the executables from Python"
# # python executables
git clone https://github.com/hsalis/Ribosome-Binding-Site-Calculator-v1.0 RBSSource

cd RBSSource

rm -rf build dist *spec
for f in `find . -name "*.py"`
do
	echo $f
	pyinstaller --clean --onefile $f
done

mv dist/* ../RBSCalculator

cd ../RBSCalculator
rm -rf ../RBSSource

echo "Building the executables from C for NUPACK"
tar xvfz ../nupack3.0.5.tar.gz
cd nupack3.0.5
make

echo ""
echo ""
echo "Done. Testing with RBSDesignerWrapper.sh."
echo "Wait for up 90 seconds."
echo "Example of output:"
echo "Program Executed"
echo "ATAGGAGACTTACTCCTATCCCCACCTGGACACTG"
echo "960.888647428"
echo "46"
echo "Launching..."
cd ..
./RBSDesignerWrapper.sh CTAGGTACAGTGCTAGCTtctaga atggtgaatgtgaaaccagtaacgttatacgatgt 1000.25
