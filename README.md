# mongodb-spring-qs

```
./mvnw spring-boot:run  -Dspring-boot.run.arguments=--mongodb.uri=mongodb://localhost:27017
```

```
./mvnw -DskipTests=true clean package
java -jar ./target/mongodb-spring-qs-0.0.1-SNAPSHOT.jar --mongodb.uri="mongodb+srv://USER:PASS@mongodb1.metafour.cloud/testdb?authSource=AUTHDB&tls=true&tlsAllowInvalidHostnames=true&maxPoolSize=5&readPreference=nearest"
```

* http://mongodb.github.io/mongo-java-driver/4.0/driver/getting-started/installation/
* http://mongodb.github.io/mongo-java-driver/4.0/driver/tutorials/connect-to-mongodb/
* http://mongodb.github.io/mongo-java-driver/4.0/apidocs/mongodb-driver-core/com/mongodb/ConnectionString.html
* https://www.baeldung.com/spring-data-mongodb-tutorial
* https://spring.io/guides/gs/accessing-data-mongodb/

