FROM nginx:1.21.6-alpine

ADD ./docker/nginx.conf /etc/nginx/nginx.conf
ADD ./dist/sample-frontend /usr/share/nginx/html/

EXPOSE 80
