FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/micronaut-example-test*.jar micronaut-example-test.jar
CMD java ${JAVA_OPTS} -jar micronaut-example-test.jar