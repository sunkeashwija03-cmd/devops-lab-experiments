# Experiment 12: Selenium Tests for a Containerized Application

Build and start the web application:
```bash
docker build -t containerized-form .
docker run --rm -p 8080:8080 containerized-form
```

Keep the container running. In a Java project with Selenium WebDriver configured, run `Main.java`. It checks the page title and submits the form. Selenium Manager in current Selenium versions can manage the browser driver.

Stop the container with `Ctrl+C` in the terminal where it is running.
