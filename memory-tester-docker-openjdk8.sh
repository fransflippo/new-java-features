#!/bin/sh
docker run -m 256m --memory-swap=256m -it -v `pwd`/target/classes:/classes openjdk:8 java -cp /classes MemoryTester
