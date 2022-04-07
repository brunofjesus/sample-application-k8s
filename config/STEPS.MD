Create a namespace named sample

```
kubectl create namespace sample
```

Switch to the namespace:

```
kubens sample
```

Deploy the deployment:
```
kubectl apply -f backend-deployment.yaml --namespace sample
```

The service is deployed, but we cannot access it yet, let's try to enable port-forwarding
for test purposes:
```
k port-forward sample-backend-xx 8080:8080
```

Increase the replica number to 2 and deploy

Now create the service
```
kubectl apply -f backend-service.yaml
```

Describe the service:
It should have two endpoints
```
kubectl describe service sample-backend
```

Deploy the ingress:
It should then be available with HTTPS enabled as well
```
k apply -f backend-ingress.yaml
```

