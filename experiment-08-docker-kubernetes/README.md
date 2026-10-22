# Experiment 8 — Docker + Kubernetes integration
**Aim:** Package an application as an image, then deploy using Kubernetes.
Experiment 7 builds `devops-hello` and Experiment 9 contains the Deployment manifest. The simple print-and-exit program is deployed as a **Job** in Experiment 9 to avoid a crash/restart loop.
1. `docker build -t devops-hello:latest ../experiment-07-containerized-app` from this directory.
2. With Docker Desktop Kubernetes enabled, make sure the cluster can see the local image. `kubectl config current-context`.
3. `kubectl apply -f ../experiment-09-kubernetes/hello-job.yaml`.
4. `kubectl get jobs,pods` and `kubectl logs job/devops-hello-job`.
5. Clean up: `kubectl delete -f ../experiment-09-kubernetes/hello-job.yaml`.
For a remote cluster, push the image to a registry and update its image name in YAML.
**Evidence:** image build, job/pod status, pod logs.
