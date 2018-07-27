package PrintHouse.email;

import PrintHouse.configuration.EmailConfig;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailSender {

    public void sendMail() throws EmailException {
        String receiver = "p_kozarski@o2.pl";
        String title = "Hello world";
        String messageContent = "ala ma kota";


        Email email = new SimpleEmail();
        email.setFrom("piotrek@cos.com");
        email.setSubject(title);
        email.setMsg(messageContent);
        email.addTo(receiver);

        email.setHostName(EmailConfig.getHOST());
        email.setSmtpPort(EmailConfig.getPORT());
        email.setAuthentication(EmailConfig.getUserLogin(), EmailConfig.getUserPassword());
        email.setSSLOnConnect(true);

        email.send();

    }

}
