[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx-gist/badass-jlink-spring-petclinic/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/beryx-gist/badass-jlink-spring-petclinic/master.svg?label=Build)](https://travis-ci.org/beryx-gist/badass-jlink-spring-petclinic)

## Custom runtime image of spring-petclinic using the badass-jlink plugin ##

This project demonstrates the capabilities of the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin/)
by creating a custom runtime image of the [Spring PetClinic](https://github.com/spring-projects/spring-petclinic).

:warning: The Spring PetClinic is an application for which modularization does more harm than good.
(This comment applies to the Spring PetClinic version used by this project, which is based on Spring Boot 2.0.4.
It may not be valid for newer versions.)
The goal of this project is only to show that it is possible to modularize the Spring PetClinic and subsequently use the Badass-JLink plugin
to create a custom runtime image of it.
A better approach for creating a custom runtime image of the Spring PetClinic is to use the
[Badass Runtime Plugin](https://github.com/beryx/badass-runtime-plugin/), as shown in [this example project](https://github.com/beryx-gist/badass-runtime-spring-petclinic).

### Quick start
From the [releases page](https://github.com/beryx-gist/badass-jlink-spring-petclinic/releases) download the archived custom runtime image for your operating system.
Unpack the archive and execute the `spring-petclinic` script found in the `spring-petclinic-image/bin` directory.  
Then, access http://localhost:8080/ in your browser.

### Creating a custom runtime image

Gradle must use Java 11 in order to be able to build the project.
To create the custom runtime image execute:

```
./gradlew jlinkZip
```

This command creates the runtime image in the `build/spring-petclinic-image` directory and a zip file of it in `build/image-zip`.

The start scripts are found in the `build/spring-petclinic-image/bin` directory.
