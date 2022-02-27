### **API GATEWAY**

This example shows api gateway pattern

###### _Required: k8s/minikube, docker_

    minikube start --driver hyperkit --cpus=2 --memory=8G --addons=ingress
    minikube ip (get ip)
    sudo nano /etc/hosts (modify iptable, add e.g. "127.16.64.10 arch.homework")
    kubectl create namespace gw
    kubectl apply -f api-gateway-bff-pattern/identity -n gw
    kubectl apply -f api-gateway-bff-pattern/gw -n gw

#### Execute Postman Collection

    newman run api-gateway.postman_collection.json
