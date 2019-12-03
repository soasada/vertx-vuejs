#!/usr/bin/env bash

mvn -U clean install -pl :vertx-frontend
mvn -U clean compile -Dmaven.test.skip=true package -pl :vertx-backend