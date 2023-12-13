#!/bin/bash
cd /opt/cdtest
echo "배포"
version=$(echo *.jar | grep -oP '\d+\.\d+\.\d+')
sudo docker build -t hellospring:$version
sudo docker run -d -p 8080:8080 --name hellospring hellospring:$version