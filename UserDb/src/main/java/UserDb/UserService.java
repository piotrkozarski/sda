package UserDb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;


public class UserService {
    public static void main(String[] args) {


        MongoClient mongoClient = MongoClients.create();
        MongoDatabase databasee = mongoClient.getDatabase("DbUserDb");
        MongoCollection<Document> collection = databasee.getCollection("users");


        User user1 = new User(1, "login1", "password1", "name1", "lastname1");
        User user2 = new User(2, "login2", "password2", "name2", "lastname2");
        User user3 = new User(3, "login3", "password3", "name3", "lastname3");
        User user4 = new User(4, "login4", "password4", "name4", "lastname4");

        collection.insertMany(Arrays.asList(UserParser.getDocument(user1), UserParser.getDocument(user2), UserParser.getDocument(user3), UserParser.getDocument(user4)));
    }

}
