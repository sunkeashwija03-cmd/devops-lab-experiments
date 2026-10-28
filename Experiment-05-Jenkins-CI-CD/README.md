# Experiment 5: CI/CD with Jenkins

This simple pipeline compiles and runs `Hello.java` on a Windows Jenkins agent.

1. Push this folder to GitHub.
2. In Jenkins, create a Pipeline job and connect the repository.
3. Select **Pipeline script from SCM**, choose Git, enter the repository URL, and set the script path to `Experiment-05-Jenkins-CI-CD/Jenkinsfile` if the repository root contains all experiment folders.
4. Ensure Java is installed and available to the Jenkins service account.
5. Run Build Now and inspect Console Output.

For a Linux Jenkins agent, replace `bat` with `sh`.
