#!/bin/sh

APP_VERSION=$(awk '/version/' package.json | cut -d ':' -f2 | cut -d '"' -f2)

# build frontend image
docker build -t brunofjesus/sample-frontend:$APP_VERSION -f ./docker/Dockerfile .

# push
docker push brunofjesus/sample-frontend:$APP_VERSION
