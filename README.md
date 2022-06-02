# How to run this web application via IntelliJ IDEA Community Edition

1 Add Maven run configuration with following parameters (also you can see example under `maven-config.png`):
- Command line: `tomcat7:run-war`
- Add "Run Maven goal" `package` in before launch task 

2 Run application via "Run" button in IDEA (or Shift + F10 hotkeys in Windows)

3 Open application on http://localhost:8081/mvcTask (also you can see link to open in Maven logs `[INFO] Running war on http://localhost:8081/mvcTask`)

4 Enjoy ;)