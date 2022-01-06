Kubernetes/Docker/SpringBoot infrastructure solution

Required: k8s/minikube, docker

1) For local execution
    1) mvn clean install
    2) at Dockerfile - fix "FROM amazoncorretto:17" according to your JAVA_HOME jdk   
    3) at k8s/deployment.yml fix image: achernyavskiy0n/otus-k8s according to your local image name
    4) kubectl apply -f k8s
   
2) for remote execution
   1) kubectl apply -f k8s
