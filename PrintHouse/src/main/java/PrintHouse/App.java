package PrintHouse;

import PrintHouse.email.EmailSender;
import PrintHouse.model.User;
import org.apache.commons.mail.EmailException;

public class App {
    public static void main(String[] args) throws EmailException {
        EmailSender sender = new EmailSender();
        User user = new User();
        user.setEmail("p_kozarski@o2.pl");
        user.setFirstName("Piotr");
        user.setLastName("Kozarski");
        sender.sendMailToNewUser(user);

    }
}
