FROM openjdk:11-jdk-alpine
VOLUME /tmp
ENV JAVA_PATH =  target/Cadastro_Musica_Festival-0.0.1-SNAPSHOT.jar Cadastro_Musica_Festival-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ java , -jar ,JAVA_PATH  ]
