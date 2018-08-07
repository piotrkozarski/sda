package Users2;


import Users2.model.User;
import Users2.service.UserService;
import Users2.service.impl.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setLogin("jkowalski");
        user1.setName("Jan");
        user1.setLastName("Kowalski");

        User user2 = new User();
        user2.setLogin("anowak");
        user2.setName("Adam");
        user2.setLastName("Nowak");

        User user3 = new User();
        user3.setLogin("pkozarski");
        user3.setName("Piotr");
        user3.setLastName("Kozarski");

        User user4 = new User();
        user4.setLogin("dwyczesany");
        user4.setName("Dawid");
        user4.setLastName("Wyczesany");

        UserService userService = new UserServiceImpl(); {
            userService.save(user1);
            System.out.println("added" + user1.getName()+ " " + user1.getLastName());
            userService.save(user2);
            System.out.println("added" + user2.getName()+ " " + user2.getLastName());
            userService.save(user3);
            System.out.println("added" + user3.getName()+ " " + user3.getLastName());
            userService.save(user4);
            System.out.println("added" + user4.getName()+ " " + user4.getLastName());

        }

    }
}
