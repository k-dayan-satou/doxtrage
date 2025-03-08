FROM ubuntu:24.04
ARG USER_ID
ARG USER_NAME
ARG GROUP_ID
ARG GROUP_NAME

RUN ln -fs /usr/share/zoneinfo/Asia/Tokyo /etc/localtime

# The package dependencies are written in pubspec.yaml
WORKDIR /doxtrage
# COPY . .

RUN apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git vim wget cmake gnupg unzip clang curl pkg-config \
    ninja-build x11-apps libgtk-3-dev libblkid-dev liblzma-dev unzip xz-utils \
    openjdk-21-jdk-headless

RUN userdel -fr `id -un $USER_ID` 

RUN useradd $USER_NAME -m -s /usr/bin/bash -u $USER_ID -o && \
    usermod -U $USER_NAME && \
    chown -R $USER_ID:$GROUP_ID /home/$USER_NAME

