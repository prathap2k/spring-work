FROM java:8
MAINTAINER Prathap Thotapalle <prathap2k@gmail.com>
LABEL Description="This is a prototype Spring Boot application with embedded Tomcat 8"

ADD maven/pathohub-springboot-startup.jar pathohub-springboot-startup.jar
ENTRYPOINT ["java","-Duser.timezone=America/Chicago","-jar","pathohub-springboot-startup.jar"]
