# Vert.x + Vue.js

Simple web application to demonstrate how to use Vert.x and Vue.js together.

## How to deploy

For deploying the app you will need the following tools installed in your machine:

* Linux (I'm using Ubuntu 18.04).
* Docker.
* JDK 13 with proper `$JAVA_HOME` configured.
* Apache Maven.

Once you have all of this installed follow these steps:

### Build project

`bash deploy.sh`

or

`chmod a+x deploy.sh && ./deploy.sh`

### Launch MySQL docker image

1. Build image:

`docker build -f docker/Dockerfile.mysql -t mysql .`

2. Run container:

`docker run -i --rm -p 3306:3306 -d --name mysql mysql`

3. For shell access while the docker image is running (optional): 

`docker exec -it mysql bash`

### Launch the App in a docker image

1. Build image:

`docker build -f docker/Dockerfile.jre -t jre .`

2. Run container:

`docker run -i --rm -p 8080:8080 -d --name jre jre`

3. For shell access while the docker image is running (optional): 

`docker exec -it jre bash`

**Now you can open the app in a web browser**