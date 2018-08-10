package Users2;


import Users2.model.Region;
import Users2.model.User;
import Users2.service.UserService;
import Users2.service.impl.UserServiceImpl;

import java.time.LocalDateTime;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Region region1 = new Region();
        region1.setRegionName("zachodniopomorski");

        Region region2 = new Region();
        region2.setRegionName("pomorski");

        Region region3 = new Region();
        region3.setRegionName("wielkopolski");

        User user1 = new User();

        user1.setCtime(LocalDateTime.now());
        user1.setLogin("jkowalski");
        user1.setName("Jan");
        user1.setLastName("Kowalski");


        User user2 = new User();
        user2.setCtime(LocalDateTime.now());
        user2.setLogin("anowak");
        user2.setName("Adam");
        user2.setLastName("Nowak");


        User user3 = new User();
        user3.setCtime(LocalDateTime.now());
        user3.setLogin("pkozarski");
        user3.setName("Piotr");
        user3.setLastName("Kozarski");

        User user4 = new User();
        user4.setCtime(LocalDateTime.now());
        user4.setLogin("dwyczesany");
        user4.setName("Dawid");
        user4.setLastName("Wyczesany");

        UserService userService = new UserServiceImpl();

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);

        System.out.println("added " + user1.getName() + " " + user1.getLastName());
        System.out.println("added " + user2.getName() + " " + user2.getLastName());
        System.out.println("added " + user3.getName() + " " + user3.getLastName());
        System.out.println("added " + user4.getName() + " " + user4.getLastName());


       /* user2.setLastName("Nowakowska");

        userService.update(user2);

        System.out.println("modified " + user2.getName() + " " + user2.getLastName());

        userService.delete(5);*/

    }
}
