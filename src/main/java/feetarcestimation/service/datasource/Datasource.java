package feetarcestimation.service.datasource;

import com.mongodb.reactivestreams.client.MongoDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.stereotype.Component;

@Component
public class Datasource {
    private final MongoDatabaseFactory mongo;

    @Autowired
    public  Datasource(MongoDatabaseFactory mongo){
        this.mongo = mongo;
    }

//    public void example(){
//        MongoDatabase db = mongo.getMongoDatabase();
//    }
}
