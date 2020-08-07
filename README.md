# New Java features

This project gives code examples of the new Java language features introduced 
since Java 1.8.

The **baseline** module shows how you would implement things without these 
features; some of them show alternatives using [Lombok](http://projectlombok.org). 
The other modules show the new language features with code examples:

## java9

You would expect examples of the new Java Platform Module System (previously
code-named "Project Jigsaw") here, but that is
currently missing because modules are not just a new language element but the
introduction of whole new aggregation level and restructuring of the JDK (but
you can read about modules along with some code examples [here](http://www.javamagazine.mozaicreader.com/SeptOct2017#&pageSet=18&page=0)).

We do demonstrate:

* **privmethiface** - private interface methods

## java10

* **localvar** - local variable type inference

## java11

Java 11 only introduces local variable syntax for lambda parameters which
is minor and doesn't warrant a code example.

## java12

* **switchexpression** - the new `switch` expression

## java13

* **textblocks** - text blocks

## java14

* **helpfulnpes** - Helpful `NullPointerException`s

* **newinstanceof** - `instanceof` pattern matching

* **records** - records

## java15

* **sealedclasses** - sealed classes

# Cgroups-aware heap sizing

If you run a Java Virtual Machine without the `-Xmx` switch, it will decide what the maximum
of memory is it will use for its heap (remember the heap is where are your objects are stored
-- any time you use `new`, you are adding to your application's heap usage).

The default algorithm is quite simple and for most modern machines means using 25% of the machine's
RAM if that is 1GB or more, or 50% if the RAM is less than 1GB. So on a 16GB machine, your default
heap size will be 4GB; on a 2GB machine it will be 1GB.

Prior to Java 8u191, there was no difference in this algorithm if you ran Java inside a container.
And in a naive setting where you don't apply memory limits to your containers, that probably would
work just fine. The "problem" starts when you start setting memory limits on your containers (which
is good practice, especially if this is a production machine and several containers are sharing
the same machine).

## Running Java in a Docker container with memory limits set

### Prior to Java 8u191

Prior to Java 8u191, if:
- you set the memory limit of your Docker container to, say, 1GB, and 
- that Docker container was running on a machine with 32GB of RAM, and 
- you didn't pass any `-Xmx` parameter to the JVM,
the JVM would set the max heap size to 32GB * 25% = 8GB.

Your app might be fine initially. But then suddenly, after a few hours, or days, it would
just crash. Why? It had tried to increase the heap to more than the 1GB set as the memory
limit of the container (remember, as far as the JDK was concerned, it was allowed to grow
to 8GB). Docker would enforce the memory limit in the only way it could: killing the container.

### Java 8u191 and later

From Java 8u191, if:
- you set the memory limit of your Docker container to, say, 1GB, and 
- that Docker container is running on a machine with 32GB of RAM, and 
- you don't pass any `-Xmx` parameter to the JVM,
the JVM will set the max heap size to 1GB * 25% = 256MB. That is, it is aware
of the memory limit set on the container it is running in and use that as the
basis for its calculation. 

### Memory tester

The Java app in `src/main/java/MemoryTester.java` demonstrates this. It runs an infinite
loop allocating byte arrays of 1MB continuously. The desirable outcome is for the JVM
to eventually throw an `OutOfMemoryException`: that means the JVM was aware of its memory
limits and didn't attempt to grow the heap beyond the memory limits of its environment.
The undesirable outcome is for the app to just crash.

Run `mvn package` and then:
* `memory-tester.sh` will run the app on your local default JVM with no max heap size provided
* `memory-tester-docker-openjdk7.sh` will run the app in a Docker container primed from the
  `openjdk:7` image with the memory limit set to 256MB and no explicit max heap size provided 
  to the JVM
* `memory-tester-docker-openjdk8.sh` will run the app in a Docker container primed from the
  `openjdk:8` image with the memory limit set to 256MB and no explicit max heap size provided
  to the JVM
* `memory-tester-docker-openjdk7-with-maxheap.sh` will run the app in a Docker container primed 
  from the `openjdk:7` image with the memory limit set to 256MB and the max heap size set 
  explicitly to 192MB with `-Xmx192m`

