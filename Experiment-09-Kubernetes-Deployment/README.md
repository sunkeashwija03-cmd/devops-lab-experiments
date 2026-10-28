# Experiment 9: Run a Containerized Application with Kubernetes

Before applying, push a web application image that listens on a port and update the image name in `deployment.yaml`. The simple Python hello-world image from Experiment 7 exits after printing, so it is useful for a Job-like demonstration but not a long-running Service.

```bash
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl get deployments
kubectl get pods
kubectl get services
```

For a web service, use an image that keeps running and listens on the `targetPort` configured in the Service.
