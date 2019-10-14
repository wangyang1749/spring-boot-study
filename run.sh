#!/usr/bin/env sh
chmod +x gradlew
./gradlew build
echo "-----------------------"
pid=`lsof -i:8084 | awk '{print $2}' | tail -n 1`
if [  -n "$pid" ];then ~/springboot_demo/
   kill -9 $pid
fi
rm -rf  ~/springboot_demo
mkdir  ~/springboot_demo
cp build/libs/gradle-springboot.jar  ~/springboot_demo
cd  ~/springboot_demo
export BUILD_ID=dontKillMe
nohup java -jar gradle-springboot.jar >>log8084.txt  &
