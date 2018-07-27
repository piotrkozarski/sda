package PrintHouse;

import PrintHouse.email.EmailSender;
import org.apache.commons.mail.EmailException;

public class App {
    public static void main(String[] args) throws EmailException {
        EmailSender sender = new EmailSender();
        sender.sendMail();

    }
}
