#!/bin/sh
docker run --name mysql-jdbc -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql