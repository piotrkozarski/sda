package PrintHouse.configuration;

public class EmailConfig {

    private static final int PORT = 465;
    private static final String HOST = "smtp.gmail.com";
    private static final String USER_LOGIN = "javaszc3@gmail.com";
    private static final String USER_PASSWORD = "java3szc";
    private static final String EMAIL_TITLE = "HELLO ";
    private static final String EMAIL_CONTENT = "This is registration confirmation message number 1";
    private static final String SET_FROM = "registration@mail.com";

    public static int getPORT() {
        return PORT;
    }

    public static String getHOST() {
        return HOST;
    }

    public static String getUserLogin() {
        return USER_LOGIN;
    }

    public static String getUserPassword() {
        return USER_PASSWORD;
    }

    public static String getEmailTitle() {
        return EMAIL_TITLE;
    }

    public static String getEmailContent() {
        return EMAIL_CONTENT;
    }

    public static String getSetFrom() {
        return SET_FROM;
    }
}

