# DevOps Lab — 12 Experiments (CS505PC)
This repository follows the 12 experiments in the uploaded St. Martin's Engineering College DevOps Lab Manual. Each folder has source code or reproducible commands and instructions.

| No. | Experiment | Folder |
|---|---|---|
| 1 | Flask event registration + Docker | `experiment-01-registration` |
| 2 | Git commands | `experiment-02-git-commands` |
| 3 | GitHub source management | `experiment-03-source-management` |
| 4 | Jenkins installation | `experiment-04-jenkins` |
| 5 | Java CI pipeline in Jenkins | `experiment-05-jenkins-ci` |
| 6 | Docker commands | `experiment-06-docker-commands` |
| 7 | Hello World container | `experiment-07-containerized-app` |
| 8 | Docker and Kubernetes integration | `experiment-08-docker-kubernetes` |
| 9 | Kubernetes automated workloads | `experiment-09-kubernetes` |
| 10 | First Selenium test | `experiment-10-selenium` |
| 11 | JavaScript increment test | `experiment-11-selenium` |
| 12 | Selenium test of Docker app | `experiment-12-selenium` |

## Windows setup
Install Git, Python 3.12+, Docker Desktop, JDK 17+, Maven, Chrome and (for Exp. 4-5) Jenkins. Enable Kubernetes in Docker Desktop for Experiments 8–9. **Start with Experiment 1, then Experiments 2–3 to push to GitHub.** Follow each folder's README to run. GitHub holds your source, but it does **not** show proof that software was installed or the experiments were run: take screenshots of actual execution separately.

## Publish to a new GitHub repository
Create an **empty** repository called `DevOps-Lab-Experiments` on your GitHub account (do not auto-create README). In the extracted project folder run:
```bash
git init
git branch -M main
git add .
git commit -m "Add all 12 DevOps lab experiments"
git remote add origin https://github.com/YOUR_USERNAME/DevOps-Lab-Experiments.git
git push -u origin main
```
GitHub may request browser sign-in. If `git remote add origin` says origin exists, check `git remote -v` before changing it. Never push passwords or credentials.

## Test status
Files are prepared as an educational starter project. **No claim is made that Docker, Maven, Jenkins, Chrome/Selenium, or Kubernetes workflows were run successfully on your own machine.** Verify them locally and capture actual outputs. The manual contains illustrative snippets with outdated versions/placeholders; this repository provides runnable adaptations and documents deviations.
