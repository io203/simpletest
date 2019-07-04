FROM java:8

ADD target/simpletest-0.0.1-SNAPSHOT.jar simpletest.jar




ENTRYPOINT ["java", "-jar", "./simpletest.jar"]