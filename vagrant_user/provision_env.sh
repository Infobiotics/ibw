#!/bin/bash
set -e

# Headless installation of Oracle's Java 8
sudo add-apt-repository -y ppa:ts.sch.gr/ppa
sudo apt-get update
echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | sudo debconf-set-selections
sudo apt-get install -y oracle-java8-installer

# Download IBW executable + supporting files
wget --progress=bar:force infobiotics.org/_static/infobiotics.tar.gz
tar -xzf infobiotics.tar.gz
rm infobiotics.tar.gz

# Change ownership of directory from root to vagrant
chown -R vagrant: infobiotics
chmod +x ~/Desktop/ibw.desktop

