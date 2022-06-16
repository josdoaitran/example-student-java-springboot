FROM maven:3.6.3 AS maven
LABEL MAINTAINER="josdoaitran@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app
RUN mvn package

#FROM openjdk:11
FROM openjdk:11-jre
EXPOSE 8080/tcp
VOLUME /tmp
ADD ./target/studentsystem-1.0.1.jar studentsystem.jar
ENTRYPOINT ["java","-jar","/studentsystem.jar"]