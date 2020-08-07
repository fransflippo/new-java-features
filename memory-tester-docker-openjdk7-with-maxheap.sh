#!/bin/sh
docker run -m 256m --memory-swap=256m -it -v `pwd`/target/classes:/classes openjdk:7 java -Xmx192m -cp /classes MemoryTester
