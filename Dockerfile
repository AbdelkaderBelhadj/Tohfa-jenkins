FROM java:8
COPY .target/tn.spring-0.0.1-SNAPSHOT.jar beepbeepservice-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","beepbeepservice-SNAPSHOT.jar" ]