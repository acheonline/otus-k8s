### **Kubernetes/Docker/SpringBoot infrastructure solution**

This example shows how works spring boot application wihin main infrastructure architecture patterns - scalability service deployment platform pattern, service-discovery pattern, liveness/readiness probe pattern, api gateway pattern

###### _Required: helm, k8s/minikube, docker_

__1) For local execution (k8s only)__

    mvn clean install
    at Dockerfile - fix "FROM amazoncorretto:17" according to your JAVA_HOME jdk   
    at k8s/deployment.yml fix image: achernyavskiy0n/otus-k8s according to your local image name
    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s
   
__2) from dockerhub execution (k8s only)__

    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s

__3) from dockerhub execution (helm/k8s/docker)__

    helm install my-db \
    --set fullnameOverride=postgres,postgresqlUsername=myuser,postgresqlPassword=passwd,postgresqlDatabase=myapp \
    bitnami/postgresql
    helm install otus ./otus-k8s
