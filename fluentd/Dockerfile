# fluentd/Dockerfile

FROM fluent/fluentd:v1.16.1-1.0
USER root
RUN ["gem", "uninstall", "-I", "elasticsearch"]
RUN ["gem", "install", "elasticsearch", "--version", "7.17.7"]
RUN ["gem", "install", "fluent-plugin-elasticsearch", "--no-document", "--version", "5.2.5"]

