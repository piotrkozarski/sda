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
                .append("Web", user.getWeb())
                .append("Is_Active", user.getIsActive())
                .append("Login", user.getLogin())
                .append("Password", user.getPassword())
                .append("Ctime", user.getCtime())
                .append("Mtime", user.getMtime());

    }


    public static User getUser(Document document) {
        User user = new User();

        Addresses address = new Addresses();

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
        //     user.setIsActive(document.getBoolean("Is_Active"));

        return user;
    }
}
// TODO ma się razem z importem robić login(email), password(pierwsza litera imienia_nazwisko),
// TODO active, ctime i mtime