FROM openjdk:21-jdk
COPY ./app/build/libs/app.jar .
WORKDIR .
ENV OPENAI_API_KEY $MY_OPENAI_API_KEY
CMD ["java", "-jar","app.jar"]