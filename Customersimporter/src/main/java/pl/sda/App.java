package pl.sda;

import pl.sda.model.User;
import pl.sda.service.CsvReader;
import pl.sda.service.UserService;

import java.util.List;

public class App {
    public static void main(String[] args) {
        UserService service = new UserService();

        List<User> userList = CsvReader.getUsers("c:/GIT/sda/Customersimporter/src/main/resources/customers.csv");
        for (User user : userList) {
            service.saveUserIntoCollection(user);
        }
    }
}
