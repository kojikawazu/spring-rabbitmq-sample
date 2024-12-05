FROM tomcat:10.1-jdk17-temurin

# Copy war file
COPY target/consumer-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/consumer.war

# Expose port
EXPOSE 8080

# Run
CMD ["catalina.sh", "run"]