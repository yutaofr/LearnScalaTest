# LearnScalaTest

Project init:
=============

* git clone ***
* gradle init --type scala-library
* gradle wrapper --gradle-version=4.9  
    
            avoid zinClasspath not found error
    
* ./gradlew builder


How to integrate with Idea
===========
build.gradle:
```
apply plugin: 'idea'

idea {
    targetVersion '13'
}

```