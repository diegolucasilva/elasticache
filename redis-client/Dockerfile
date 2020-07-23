FROM fabric8/java-alpine-openjdk11-jre
RUN mkdir app
ARG JAR_FILE
ADD /target/${JAR_FILE} /app/redis-client.jar
WORKDIR /app
ENTRYPOINT java -jar redis-client.jar -Dspring.profiles.active=local