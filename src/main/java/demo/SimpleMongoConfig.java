package demo;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SimpleMongoConfig {

    @Value("${mongodb.uri:mongodb://localhost:27017}")
    private String mongodbUri;
  
    @Bean
    public MongoClient mongo() {
        return MongoClients.create(mongodbUri);
    }
 
    // @Bean
    // public MongoTemplate mongoTemplate() throws Exception {
    //     return new MongoTemplate(mongo(), "test");
    // }
}