FROM tomcat:10.1-jdk17-temurin

# アプリケーションのWARファイルをコピー
COPY target/producer-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/producer.war

# ポートを公開
EXPOSE 8080

CMD ["catalina.sh", "run"]