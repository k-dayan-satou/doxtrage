#!/bin/bash

echo LOCAL_WORKSPACE_FOLDER="../doxtrage" > .env
echo WORK_UID=`id -u` >> .env
echo WORK_UNAME=`id -un` >> .env
echo WORK_GID=`id -g` >> .env
echo WORK_GNAME=`id -gn` >> .env
