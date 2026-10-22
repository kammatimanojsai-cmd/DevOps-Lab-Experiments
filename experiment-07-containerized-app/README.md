# Experiment 7 — Containerized Hello World
**Aim:** Dockerize the Python Hello World program.
```bash
docker build -t devops-hello .
docker run --name devops-hello-container devops-hello
docker logs devops-hello-container
docker rm devops-hello-container
```
Expected output: `Hello World from Docker!`
**Evidence:** build, run, logs. Run in this experiment's folder.
