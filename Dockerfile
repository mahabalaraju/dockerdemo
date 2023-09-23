FROM openjdk:17
LABEL maintainer ="mahabalaraj"
EXPOSE 9099
ADD target/ducklings.jar duck
ENTRYPOINT [ "java","-jar","ducklings.jar"]