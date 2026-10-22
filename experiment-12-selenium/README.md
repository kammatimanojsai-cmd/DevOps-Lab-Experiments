# Experiment 12 — Selenium test of containerized app
**Aim:** Automate form submission against the Experiment 1 Flask app running in Docker.
In terminal 1, run from Experiment 1 directory: `docker build -t devops-registration .` and `docker run --rm -p 5000:5000 devops-registration`.
In terminal 2, run `mvn test` from this experiment directory (JDK 17+, Maven and Chrome required).
This test targets http://localhost:5000/register, which is the *actual* page in the lab repository rather than the manual's placeholder app on port 8080.
**Evidence:** container running, Selenium test passed, registration success screen.
