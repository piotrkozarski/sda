package pl.sda.service;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import pl.sda.model.User;

import java.util.Optional;

public class UserService {
    MongoClient mongoClient = new MongoClient();
    MongoDatabase database = mongoClient.getDatabase("CustomersImporter");
    MongoCollection<Document> collection = database.getCollection("users");
//TODO ma się razem z importem robić login(email), password(pierwsza litera imienia_nazwisko), active, ctime i mtime

    public void saveUserIntoCollection(User user) {

        user.setIsActive(true);

        collection.insertOne(UserParser.getDocument(user));
    }

  /*  private Optional<User> getUserByEmail(String email) {
        FindIterable<Document> document = collection.find.;


    }*/
}
