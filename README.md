### **API GATEWAY**

This example shows api gateway pattern

###### _Required: k8s/minikube, docker_

    kubectl create namespace gw
    kubectl apply -f api-gateway-bff-pattern/identity -n gw
    kubectl apply -f api-gateway-bff-pattern/gw -n gw
 
 Postman check execution:
    
    newman run postman.json
