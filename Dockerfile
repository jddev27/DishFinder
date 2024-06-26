FROM openjdk:21-jdk
COPY ./app/build/libs/app.jar .
WORKDIR .
ARG MY_OPENAI_API_KEY
ARG MY_APP_API_KEY
ENV ENV_OPENAI_API_KEY $MY_OPENAI_API_KEY
ENV ENV_APP_API_KEY $MY_APP_API_KEY
CMD ["java", "-jar","app.jar"]