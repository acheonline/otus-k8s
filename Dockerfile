FROM amazoncorretto:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} otus-for-k8s-homework-1.0-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/otus-for-k8s-homework-1.0-SNAPSHOT.jar"]