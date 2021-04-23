# Dockerfile relying on maven build jar before docker build
Build Docker Image

`docker build . -t springreact`

Run

`docker run -p 8080:8080 springreact`

# Dockerfile with maven build stage
Build Docker Image

`docker build -f DockerfileBuildStage. -t springreact`

Run

`docker run -p 8080:8080 springreact`
