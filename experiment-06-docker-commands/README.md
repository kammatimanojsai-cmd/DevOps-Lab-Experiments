# Experiment 6 — Docker commands
**Aim:** Practice image/container lifecycle commands.
```bash
docker version
docker pull hello-world
docker images
docker run --name lab-hello hello-world
docker ps -a
docker logs lab-hello
docker rm lab-hello
docker pull nginx:alpine
docker run -d --name lab-nginx -p 8081:80 nginx:alpine
docker ps
docker stop lab-nginx
docker start lab-nginx
docker stop lab-nginx
docker rm lab-nginx
```
Optional registry push requires a Docker Hub account, login, tag and push; do not publish private credentials.
**Evidence:** commands and outputs (`docker ps`, `docker images`, logs). Requires Docker running.
