FROM ubuntu:24.04

RUN ln -fs /usr/share/zoneinfo/Asia/Tokyo /etc/localtime

# The package dependencies are written in pubspec.yaml
WORKDIR /doxtrage
# COPY . .

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git vim wget cmake gnupg unzip clang curl pkg-config \
    ninja-build x11-apps libgtk-3-dev libblkid-dev liblzma-dev unzip xz-utils \
    openjdk-21-jdk-headless

