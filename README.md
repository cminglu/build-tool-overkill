# build-tool-overkill

A sample Java project that can be built with Ant, Maven and Gradle (for comparison purposes).

## Using Ant

To compile and test the project, run `ant test`.

To generate a coverage report, run `ant report`.

To publish the project to a local directory, run `ant dist`.

## Using Maven

To compile and test the project, run `mvn compile test`.

To generate a coverage report, run `mvn verify`.

To publish the project to a local repository, run `mvn install`.

## Using Gradle

To compile and test the project, run `gradle build`.

To generate a coverage report, run `gradle jacocoTestReport`.

To publish the project to a local repository, run `gradle publishToMavenLocal`.
