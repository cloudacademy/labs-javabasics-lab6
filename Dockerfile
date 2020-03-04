FROM cloudacademydevops/ide:java11
USER root
WORKDIR /root/lab
COPY lab ./
CMD [ "-f", "/dev/null" ]
ENTRYPOINT [ "tail" ]