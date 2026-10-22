# Experiment 9 — Automating Kubernetes deployment
**Aim:** Run Experiment 7 automatically in Kubernetes; demonstrate long-running replica deployment separately.
**Hello World batch job:** Build image from Experiment 7: `docker build -t devops-hello:latest ../experiment-07-containerized-app`. Enable Docker Desktop Kubernetes, then `kubectl apply -f hello-job.yaml`, `kubectl get jobs,pods`, `kubectl logs job/devops-hello-job`. The manual uses a Deployment for Hello World, but a Job is the correct Kubernetes controller for a short-lived script.
**Replicated web deployment:** Build Experiment 1: `docker build -t devops-registration:latest ../experiment-01-registration` and run `kubectl apply -f registration-deployment.yaml -f registration-service.yaml`. Check `kubectl get deploy,pods,svc`; expose using `kubectl port-forward svc/devops-registration 5000:5000`, then open http://localhost:5000/register .
**Note:** `imagePullPolicy: Never` assumes Docker Desktop Kubernetes can access the locally built images; on another cluster push images to a registry and change `image` and `imagePullPolicy`.
**Evidence:** YAML, pod/job status, logs, browser.
