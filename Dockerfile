FROM  openjdk:17
COPY ./target/springbootdockerdemo-0.0.1-SNAPSHOT.jar springboot.jar

ENTRYPOINT ["java","-jar","springboot.jar"]