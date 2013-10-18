#!/bin/bash

buildDir="./workshop-spring-data-jpa-labs"
outputName="workshop-spring-data-jpa-labs"

mvn clean install -Dmaven.test.skip
mvn dependency:copy-dependencies -Dmdep.useRepositoryLayout=true
mvn dependency:copy-dependencies -Dclassifier=sources -Dmdep.failOnMissingClassifierArtifact=false -Dmdep.useRepositoryLayout=true

rm -rf $buildDir
mkdir $buildDir
mkdir "$buildDir"/repo

for file in $(ls -d spring-*)
do
  directory="$file"/target/dependency
  test -e $directory
#  printf "$file $?\n"
  if [ "$?" -eq 0 ]
  then
    cp -r "$file"/target/dependency/* "$buildDir"/repo/
  fi
done

mvn clean
mkdir "$buildDir"/projects
cp -r ./spring-* "$buildDir"/projects
cp pom.xml "$buildDir"/projects
mvn -f "$buildDir"/projects/pom.xml eclipse:eclipse

rm -f "$outputName".zip
zip -qr $outputName "$buildDir"/*
rm -rf $buildDir
