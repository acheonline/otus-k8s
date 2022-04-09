### **Kubernetes/Docker/SpringBoot infrastructure solution**

This example shows how works spring boot application wihin main infrastructure architecture patterns - scalability service deployment platform pattern, service-discovery pattern, liveness/readiness probe pattern, api gateway pattern

###### _Required: helm, k8s/minikube, docker_

Start minikube cluster

    minikube start 
Delete all resources and namespace of previous nginx-controller, check total delete by command `kubectl get namespace` - there should be no nginx namespaces. If false, delete manually)

    minikube addons disable ingress
Add namespace monitoring. Set k8s context to it. Search and update local Kube_prom_stack and Nginx-Controller repos for Helm installation

    kubectl create namespace monitoring
    kubectl config set-context --current --namespace=monitoring
    helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
    helm repo add prometheus-community https://prometheus-community.github.io/helm-charts
    helm repo update
    helm install nginx ingress-nginx/ingress-nginx -f nginx-ingress.yaml --atomic
Install kube-prom-stack via Helm

    helm install prom prometheus-community/kube-prometheus-stack -f prometheus.yaml --atomic
Execute Grafana

    kubectl port-forward service/prom-grafana 9000:80

Add Grafana JSON dashboard

    Otus Homework Dashboard.json

Execute Prometheus

    kubectl port-forward service/prom-kube-prometheus-stack-prometheus 9090:9090

Install project templates via Helm
    
    kubectl apply -f ./k8s/namespace.yml
    helm install otus ./otus-k8s --namespace otus-ns
 
Postman check execution:
    
    newman run otus.hw2.postman_collection.json
