package pl.sda.service;

import org.bson.Document;
import pl.sda.model.Addresses;
import pl.sda.model.User;


public class UserParser {
    public static Document getDocument(User user) {
        return new Document("FirstName", user.getFirstName())
                .append("LastName", user.getLastName())
                .append("Company", user.getCompany())

                .append("Addres", new Document("Address", user.getAddress().getAddress())
                        .append("City", user.getAddress().getCity())
                        .append("County", user.getAddress().getCity())
                        .append("State", user.getAddress().getState())
                        .append("ZIP", user.getAddress().getZip()))

                .append("Phone", user.getPhone())
                .append("Fax", user.getFax())
                .append("Email", user.getEmail())
                .append("Email", user.getEmail())
                .append("Web", user.getWeb());
    }

    public static User getUser(Document document) {
        User user = new User();

        Addresses address = new Addresses();  //TODO nie wiem co wpisać

        user.setFirstName(document.getString("FirstName"));
        user.setLastName(document.getString("LastName"));
        user.setCompany(document.getString("Company"));

        address.setAddress(document.getString("Address"));
        address.setAddress(document.getString("City"));
        address.setAddress(document.getString("County"));
        address.setAddress(document.getString("State"));
        address.setAddress(document.getString("ZIP"));

        user.setPhone(document.getString("Phone"));
        user.setFax(document.getString("Fax"));
        user.setEmail(document.getString("Email"));
        user.setWeb(document.getString("Web"));

        return user;
    }
}