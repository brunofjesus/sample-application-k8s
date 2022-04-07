#!/bin/sh

APP_VERSION=$(awk '/version/' package.json | cut -d ':' -f2 | cut -d '"' -f2)

# build frontend image
docker buildx build -t brunofjesus/sample-frontend:$APP_VERSION -f ./docker/Dockerfile --push --platform=linux/arm64,linux/amd64 .

# push
#docker push brunofjesus/sample-frontend:$APP_VERSION
