package PrintHouse.email;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {

    private static final int PORT = 465;
    private static final String HOST = "smtp.gmail.com";
    private static final String USER_LOGIN = "javaszc3@gmail.com";
    private static final String USER_PASSWORD = "java3szc";

    public void sendMail() throws EmailException {
        String receiver = "p_kozarski@o2.pl";
        String title = "Hello world";
        String messageContent = "ala ma kota";


        Email email = new SimpleEmail();
        email.setFrom("piotrek@cos.com");
        email.setSubject(title);
        email.setMsg(messageContent);
        email.addTo(receiver);

        email.setHostName(HOST);
        email.setSmtpPort(PORT);
        email.setAuthentication(USER_LOGIN, USER_PASSWORD);
        email.setSSLOnConnect(true);

        email.send();

    }

}
