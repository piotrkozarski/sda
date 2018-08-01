package pl.sda;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.opencsv.CSVReader;
import org.bson.Document;
import pl.sda.model.User;
import pl.sda.service.CsvReader;

import javax.jws.soap.SOAPBinding;
import java.io.FileReader;
import java.util.List;

public class App {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        MongoDatabase database = mongoClient.getDatabase("CustomersImporter");
        MongoCollection<Document> collection = database.getCollection("users");
//TODO imort do bazy tej listy ponizej

        List<User> userList = CsvReader.getUsers("c:/GIT/sda/Customersimporter/src/main/resources/customers.csv");
        for (User user : userList) {


            System.out.println(user);
        }

    }
}


