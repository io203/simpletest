FROM java:8

ADD target/simpletest-backend-0.0.1-SNAPSHOT.jar simple-test.jar

ENTRYPOINT ["java", "-jar", "./simple-test.jar"]
