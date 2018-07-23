#**
#* Copyright (c) 2018, Sͬeͥbͭaͭsͤtͬian.
#*
#* This software is distributable under the BSD license. See the terms of the
#* BSD license in the documentation provided with this software.
#*
#* http://www.opensource.org/licenses/bsd-license.php
#*/

### Q&D build script

# __Clear
cd bin
  rm -R *
cd .. 

# __JAVA
# ____build target
cd ./src/main/java
  find . -name "*.java" >filelist.tmp
  javac -d ../../../bin @filelist.tmp
  rm ./filelist.tmp
cd ../../..

# ____pack target
cd bin
  find ./lang/libc -name "*.class"  >filelist.tmp
  find ./langx  -name "*.class"    >>filelist.tmp
  jar --create --file libc.jar @filelist.tmp
  rm ./filelist.tmp
cd ..

# ____build Java samples
cd ./src/test/java
  find . -name "*.java" >filelist.tmp
  javac -cp ../../../bin/libc.jar -d ../../../bin @filelist.tmp
  rm ./filelist.tmp
cd ../../..


# ____clear Java class dir
cd bin
#  rm -R lang
cd ..

# __C
# ____build C samples
gcc -o ./bin/singles/HelloCWorld   ./src/test/c/singles/HelloCWorld.c     -Wall
gcc -o ./bin/singles/CliInput      ./src/test/c/singles/CliInput.c        -Wall

# __Execute
                        ./bin/singles/HelloCWorld
java -cp ./bin/libc.jar:./bin singles.HelloCWorld

# __EOF