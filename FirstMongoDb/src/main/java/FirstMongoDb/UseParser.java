package FirstMongoDb;

import org.bson.Document;

public class UseParser {
    public static Document getDocument(Users users) {
        return new Document("login", users.getLogin())
                .append("name", users.getName())
                .append("lastname", users.getLastName())
                .append("age", users.getAge());
    }

    public static Users getUsers(Document document) {
        return new Users(document.getString("login"),
                document.getString("name"),
                document.getString("lastname"),
              document.getInteger("age"));
    }
}
