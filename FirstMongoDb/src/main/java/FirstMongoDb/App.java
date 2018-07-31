package FirstMongoDb;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("MyNewDB");
        MongoCollection<Document> collection = database.getCollection("users");

        Users users1 = new Users("janeklogin1", "jan1", "kowalski1", 22);
        Users users2 = new Users("adamlogin", "adam", "nowak", 21);

   //     collection.insertOne(UseParser.getDocument(users1));

        collection.insertMany(Arrays.asList(UseParser.getDocument(users1), UseParser.getDocument(users2)));

        MongoCursor<Document> cursor = collection.find().iterator();
        try{
            while (cursor.hasNext()){
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
    }
}
