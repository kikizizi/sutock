FROM openjdk:8

ENV LANG=C.UTF-8

COPY ./sutock /opt/sutock

WORKDIR /opt/sutock

RUN ./gradlew --refresh-dependencies
