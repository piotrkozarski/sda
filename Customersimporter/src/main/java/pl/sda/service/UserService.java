package pl.sda.service;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import  com.mongodb.client.model.Filters;
import org.bson.Document;
import pl.sda.model.User;

import java.time.LocalDateTime;
import java.util.Optional;

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
//TODO teraz sprawdzać czy za pomocą tego optionala ponizej, czy ten login jest i jak jest to update a jak nie to insert


    public Optional<User> getUserByLogin(String login){
        Document userDoc = collection.find(Filters.eq("Login", login)).first();

        if (userDoc == null)
            return Optional.empty();

        return Optional.of(UserParser.getUser(userDoc));
    }
}
