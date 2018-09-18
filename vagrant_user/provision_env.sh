#!/bin/bash
set -e

sudo apt-get install -y python-software-properties debconf-utils software-properties-common
export http_proxy="http://username:password@proxy:port/"
export https_proxy="https://username:password@proxy:port/"
sudo add-apt-repository -y ppa:webupd8team/java
echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | sudo debconf-set-selections
sudo apt-get update
sudo apt-get install -y --allow-unauthenticated oracle-java8-installer
unset http_proxy
unset https_proxy

wget --progress=bar:force infobiotics.org/files/infobiotics.tar.gz
tar -xzf infobiotics.tar.gz
rm infobiotics.tar.gz