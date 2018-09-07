# fresa - Flowable REst Sample Application

## Introduction

A sample application using flowable rest api, based on spring boot.

## How to start the application

### Docker compose

fresa uses mysql as database. In order to start the database, a `docker-compose.yml` file is provided

To start the docker compose, you can use the `start-db.sh` script

To stop the docker compose, you can use the `stop-db.sh` script

### Spring boot application

After starting docker compose you can start the application with your favourite IDE or directly from
the command line using the command `mvn spring-boot:run`. After starting the application, it can be
accessed on the url http://localhost:8080/fresa


#### Security

A very simple security for all web requests is in place: `rest-admin / test`

 
