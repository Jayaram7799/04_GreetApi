FROM openjdk:17

COPY target/GreetApi.jar /use/app

WORKDIR /use/app

EXPOSE 8082

ENTRYPOINT [ "java","-jar","GreetApi.jar" ]