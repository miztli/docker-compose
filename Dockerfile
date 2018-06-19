FROM openjdk:8u171-jre-alpine3.7

ENV APP_DIR /apps/practice01

ADD build/libs/properties-samples-0.0.1-SNAPSHOT.jar $APP_DIR/properties-samples-0.0.1-SNAPSHOT.jar

WORKDIR $APP_DIR

RUN sh -c 'chmod +x properties-samples-0.0.1-SNAPSHOT.jar'

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=standalone", "-jar",  "properties-samples-0.0.1-SNAPSHOT.jar"]
