# Test Assignment Solution #

## Overview ##

This is a test automation framework for test assignment.

## Technical content ##
- Java 8
- JUnit 4.12
- Selenium WebDriver 3.141.59
- Gradle 6.5.1

## Mandatory Gradle dependencies ##

- testImplementation 'junit:junit:4.12'
- testImplementation 'org.seleniumhq.selenium:selenium-java:3.141.59'

### Execution from command line ###

Prerequisites:
- Installed Gradle (Follow https://gradle.org/install)

Command (Run from /selenium directory):
- gradle clean test

Analyze results:
- File /selenium/build/reports/tests/test/index.html

### Execution in Docker container ###

Prerequisites:
- Installed and started Docker (Follow https://www.docker.com/get-started)
- Installed Gradle (Follow https://gradle.org/install)
- Pulled Gradle image (docker pull gradle)

Command (Run from /selenium directory):
- Unix: docker run --rm -u gradle -v "$PWD":/home/gradle/project -w /home/gradle/project gradle gradle test
- Windows: docker run --rm -u gradle -v %cd%:/home/gradle/project -w /home/gradle/project gradle gradle test

Analyze results:
- File /selenium/build/reports/tests/test/index.html

### Execution in IDEA ###

Ctrl+Shift+F10 in TestClass.class