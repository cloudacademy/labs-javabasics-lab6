FROM docker.io/theiaide/theia-java:latest
USER root
WORKDIR /root/lab
COPY lab ./
CMD [ "-f", "/dev/null" ]
ENTRYPOINT [ "tail" ]