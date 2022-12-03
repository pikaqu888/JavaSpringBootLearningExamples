# devcology-sample-java-mongoDB

# Build docker image
docker build --tag java-docker .

# Create container and run in port 
docker run -d --name java-mongoDB -p 8081:8081 java-docker
