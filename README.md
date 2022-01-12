### **Kubernetes/Docker/SpringBoot infrastructure solution**

This example shows how works spring boot application wihin main infrastructure architecture patterns - scalability service deployment platform pattern, service-discovery pattern, liveness/readiness probe pattern, api gateway pattern

###### _Required: k8s/minikube, docker_

__1) For local execution__

    mvn clean install
    at Dockerfile - fix "FROM amazoncorretto:17" according to your JAVA_HOME jdk   
    at k8s/deployment.yml fix image: achernyavskiy0n/otus-k8s according to your local image name
    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s
   
__2) for remote execution__

    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s
