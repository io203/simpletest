FROM java:8

ADD target/simpletest-0.0.1-SNAPSHOT.jar simple-test.jar

//tomcat base 
//FROM tomcat:8.0.20-jre8 
//COPY /target/myApplication.war /usr/local/tomcat/webapps/ 

ENTRYPOINT ["java", "-jar", "./simple-test.jar"]
