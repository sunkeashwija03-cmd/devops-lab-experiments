# Experiment 6: Docker Commands for Container Management

```bash
docker --version
docker pull hello-world
docker run --name mycontainer hello-world
docker ps
docker ps -a
docker start mycontainer
docker stop mycontainer
docker rm mycontainer
docker images
docker rmi IMAGE_NAME
docker login
docker tag IMAGE_NAME YOUR_DOCKERHUB_USERNAME/IMAGE_NAME:latest
docker push YOUR_DOCKERHUB_USERNAME/IMAGE_NAME:latest
```

Use your own Docker Hub username and image name. Only push images you own or are authorized to publish.
