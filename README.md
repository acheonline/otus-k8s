### **Kubernetes/Docker/SpringBoot infrastructure solution**

This example shows how works spring boot application wihin main infrastructure architecture patterns - scalability service deployment platform pattern, service-discovery pattern, liveness/readiness probe pattern, api gateway pattern

###### _Required: helm, k8s/minikube, docker_

__1) For local execution (k8s only)__

    mvn clean install
    at Dockerfile - fix "FROM amazoncorretto:17" according to your JAVA_HOME jdk   
    at k8s/deployment.yml fix image: achernyavskiy0n/otus-k8s according to your local image name
    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s
   
__2) for remote execution (k8s only)__

    kubectl apply -f k8s/namespace.yml
    kubectl apply -f k8s

__3) for remote execution (helm/k8s/docker)__

    helm install pg bitnami/postgresql -f ./pg-values.yaml
    helm install otus ./otus-k8s
