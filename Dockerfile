FROM  openjdk:17
COPY ./target/myproject-1.0-SNAPSHOT.jar springboot.jar

ENTRYPOINT ["java","-jar","springboot.jar"]