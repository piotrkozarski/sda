package UserDb;

import org.bson.Document;

public class UserParser {
    public static Document getDocument(User user) {
        return new Document("id", user.getId())
                .append("login", user.getLogin())
                .append("password", user.getPassword())
                .append("name", user.getName())
                .append("lastname", user.getLastName()
                );
    }

    public static User getUserById(Document document) {
        return new User(document.getInteger("id"),
                document.getString("login"),
                document.getString("password"),
                document.getString("name"),
                document.getString("lastname")
        );
    }
    public static User getUserByLogin(Document document){
        return new User(document.getString("login"),
                document.getInteger("id"),
                document.getString("name"),
                document.getString("lastname")


                );
    }

}
