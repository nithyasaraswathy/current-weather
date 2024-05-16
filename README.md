# Current Weather Application

- This repository contains a java application that retreive current weather based on latitude and longitude using open-metro API.

## Prerequisites
- Docker  
- Install Docker https://www.docker.com/products/docker-desktop/

## Building the Docker Image

- Navigate to the project directory: Open a terminal and navigate to the root directory of the project where the **Dockerfile** is located.
- Build the Docker image: use `docker build` command to create a docker image.The --tag(-t) used to name the image.

       docker build --tag current-weather .

## Run the Docker Image
- Use `docker run` command to start the container from the built image.The `-p` option is used to map the container's port to the host machine's port.

      docker run -p 8080:8080 current-weather

## Accessing Application
- Once the container is running ,access the application in the web browser 
     http://localhost:8080/weather?latitude=LATITUDE&longitude=LONGITUDE [Replace LATITUDE and LONGITUDE with the desired values.]

- Example :
To get the weather specific to Toronto : http://localhost:8080/weather?latitude=43.65324&longitude=79.3832


