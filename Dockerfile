FROM cloudacademydevops/ide:java11
WORKDIR /home/theia/lab
COPY lab ./
RUN sudo chown -R theia:theia .