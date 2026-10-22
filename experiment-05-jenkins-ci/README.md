# Experiment 5 — Jenkins CI/CD
**Aim:** Use Jenkins to build/test a Java application from GitHub.
Run locally: `mvn clean verify`, then `java -jar target/jenkins-ci-demo-1.0-SNAPSHOT.jar`.
In **Windows Jenkins**, install/configure JDK 17 tool named `JDK17` and Maven named `Maven3` in **Manage Jenkins → Tools**. Create a **Pipeline** job sourcing your GitHub repo, set **Script Path** to `experiment-05-jenkins-ci/Jenkinsfile`, and Build Now.
The included Jenkinsfile checks out the code, runs Maven tests and archives the JAR. On Linux agents change `bat` to `sh`.
A production deployment is **not** configured; for this lab the deployable JAR is archived as the result.
**Evidence:** green Jenkins build, test reports, build artifact, console log.
