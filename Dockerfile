FROM openjdk:17-slim

COPY ./target/tusom*.jar /usr/app/tusom.jar

WORKDIR /usr/app

RUN sh -c 'touch tusom.jar'

ENTRYPOINT ["java","-jar","tusom.jar"]