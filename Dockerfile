FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-integration-gestion-des-patients.jar docker-jenkins-integration-gestion-des-patients.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-gestion-des-patients.jar"]