# LearnScalaTest

Introduction
============

Learn how gradle works, and discover the scalaTest advanced features.

HowTo
=====

Init the project
------------
```
git clone ***
gradle init --type scala-library
gradle wrapper --gradle-version=4.9   
./gradlew builder
```
Note important, as bug with default gradle version like zinClasspath not found error, in order to avoid this, the wrapper should use 4.9 version


Integrate with Idea
--------------------------
build.gradle:
```
apply plugin: 'idea'

idea {
    targetVersion '13'
}

```

Generate ScalaDoc
=================
```
./gradlew scaladoc
```
The generated scalaDoc will be found at build/docs