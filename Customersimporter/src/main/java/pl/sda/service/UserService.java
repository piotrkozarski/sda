package pl.sda.service;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import pl.sda.model.User;

import java.time.LocalDateTime;

public class UserService {
    MongoClient mongoClient = new MongoClient();
    MongoDatabase database = mongoClient.getDatabase("CustomersImporter");
    MongoCollection<Document> collection = database.getCollection("users");
// TODO ma się razem z importem robić login(email), password(pierwsza litera imienia_nazwisko),
// TODO active, ctime i mtime

    public void saveUserIntoCollection(User user) {

        user.setIsActive(true);
        user.setCtime(LocalDateTime.now());
        user.setMtime(LocalDateTime.now());

        user.setLogin(user.getEmail().toLowerCase());
        user.setPassword(user.getFirstName().toLowerCase().substring(0, 1) + user.getLastName().toLowerCase());

        collection.insertOne(UserParser.getDocument(user));


    }
}
