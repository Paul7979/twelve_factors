# Twelve Factors

## I. Codebase
The codebase is under version control via git. It can be deployed in several configurations.

## II. Dependencies
All dependencies are managed via maven and are declared in the pom.xml file.

## III. Config
Configuration is done via environment variables. In this sample they are loaded via an .env file from which the values of the variables are loaded.
The .env file is referenced in the docker-compose file and imported as OS-agnostic environment variables.

## IV. Backing services
The used posgresql database could be exchanged for a managed postgres database by just adapting the configuration.

## VI. Processes
There is no persistence happening besides the one in the database. The microservice could easily by scaled out/restarted without any impact on its functionality.

## VII. Port binding 
The microservice comes with an embeded Tomcat webserver and exposes its services on port 8080.

## IX. Disposability
The startup time is about 10 seconds. Spring closes all database connections and has a robust graceful shutdown mechanism.

## XI. Logs
Logs are written to stdout in an unbuffered qay.
