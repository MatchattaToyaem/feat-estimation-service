FROM maven:3.6.0-jdk-11-slim AS build

COPY src /home/app/src

COPY pom.xml /home/app

COPY ./opencv_java430.dll /home/app/opencv_java430.dll

ENV DATABASE_URL=mongodb://db:27017/

ENV DATABASE=masterdata

RUN mvn -f /home/app/pom.xml clean package

FROM adoptopenjdk/openjdk8:alpine-slim

VOLUME /tmp

EXPOSE 8080

COPY --from=build /home/app/target/service-0.0.1-SNAPSHOT.jar feet-arch-estimation.jar

ADD ./opencv_java430.dll opencv_java430.dll

# RUN apk update && apk add --no-cache libc6-compat

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/feet-arch-estimation.jar"]