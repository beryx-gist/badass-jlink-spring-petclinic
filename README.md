[![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://github.com/beryx-gist/badass-jlink-spring-petclinic/blob/master/LICENSE)
[![Build Status](https://img.shields.io/travis/beryx-gist/badass-jlink-spring-petclinic/master.svg?label=Build)](https://travis-ci.org/beryx-gist/badass-jlink-spring-petclinic)

## Custom runtime image of spring-petclinic using the badass-jlink plugin ##

This project demonstrates the capabilities of the [Badass JLink Plugin](https://github.com/beryx/badass-jlink-plugin/)
by creating a custom runtime image of the [Spring PetClinic](https://github.com/spring-projects/spring-petclinic).

You can use it as a template to create a custom runtime image for your own modular spring-boot application.
However, this is not an easy task. If you don't really need to modularize your spring application, you may consider creating a custom runtime image using the
[Badass Runtime Plugin](https://github.com/beryx/badass-runtime-plugin/), as shown in [this example project](https://github.com/beryx-gist/badass-runtime-spring-petclinic).

### Quick start
From the [releases page](https://github.com/beryx-gist/badass-jlink-spring-petclinic/releases) download the archived custom runtime image for your operating system.
Alternatively, for Linux, you can download [the most recent custom runtime image](https://github.com/beryx-gist/badass-jlink-spring-petclinic/tree/images).
Unpack the archive and execute the `spring-petclinic` script found in the `image/bin` directory.  
Then, access http://localhost:8080/ in your browser.

### Creating a custom runtime image

Gradle must use Java 11 or newer in order to be able to build the project.
To create the custom runtime image execute:

```
./gradlew clonePetclinic
./gradlew jlinkZip
```

This command creates the runtime image in the `build/image` directory and a zip file of it in `build/image-zip`.

The start scripts are found in the `build/image/bin` directory.
