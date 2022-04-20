## **ORDER SERVICE (MSA) with idempotency**

Реализация Сервиса Заказа с применением паттерна идемпотентности. 
При создании заказа формируется и сохраняется UUID, который запрещает создавать ровно такой же по составу заказ
***
### Архитектура сервиса

![](pics/msa-result-architecture.jpg)


## Запуск проекта
    minikube start --kubernetes-version v1.23.0 --driver hyperkit --cpus=2 --memory=8G --addons=ingress
    minikube ip (get ip)
    sudo nano /etc/hosts (modify iptable, add e.g. "127.16.64.10 arch.homework")
    
    kubectl create namespace kafka
    kubectl create -f 'https://strimzi.io/install/latest?namespace=kafka' -n kafka
    kubectl apply -f https://strimzi.io/examples/latest/kafka/kafka-persistent-single.yaml -n kafka 
    kubectl wait kafka/my-cluster --for=condition=Ready --timeout=300s -n kafka 
    
    kubectl create namespace otus
    helm install otus ./otus-k8s --namespace otus

### Postman collection run
    
    newman run idempotency.order.service.creation.order.postman_collection.json

