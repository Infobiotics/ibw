#!/bin/bash
set -e

USERNAME=$1
PASSWORD=$2

sudo apt-get update
sudo apt-get -y install git
sudo apt-get -y install openjdk-8-jdk

git clone https://$USERNAME:$PASSWORD@code.ico2s.org/roadblock.xtext
cd roadblock.xtext
git checkout develop
cd ..

wget http://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/mars/2/eclipse-rcp-mars-2-linux-gtk-x86_64.tar.gz -O eclipse_download.tar.gz
tar -zxf eclipse_download.tar.gz
rm eclipse_download.tar.gz

git clone https://github.com/seeq12/eclipse-import-projects-plugin.git
cp eclipse-import-projects-plugin/jar/* eclipse/plugins 
rm -rf eclipse-import-projects-plugin

cd eclipse
./eclipse -noSplash -application org.eclipse.equinox.p2.director \
-repository \
http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/,\
http://download.eclipse.org/modeling/emf/emf/updates/,\
http://download.itemis.com/updates/,\
http://download.eclipse.org/tools/cdt/releases/8.8.1/ \
-installIUs \
org.eclipse.xtext.sdk.feature.group/2.8.4.v201508050135,\
org.eclipse.xtext.redist.feature.group/2.8.4.v201508050135,\
org.eclipse.emf.sdk.feature.group/2.11.0.v20150601-0402,\
org.eclipse.xtend.sdk.feature.group/2.8.4.v201508050135,\
org.eclipse.xtend.gwt.feature.group/2.8.4.v201508050135,\
de.itemis.xtext.antlr.feature.feature.group/2.1.1.v201405091103,\
de.itemis.xtext.antlr.sdk.feature.group/2.1.1.v201405091103,\
org.eclipse.cdt,\
org.eclipse.cdt.managedbuilder.core

./eclipse -noSplash -application org.eclipse.cdt.managedbuilder.core.headlessbuild \
-data ../ibw_workspace \
-importAll ../roadblock.xtext 
