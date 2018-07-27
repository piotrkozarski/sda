package PrintHouse.configuration;

public class EmailConfig {

    private static final int PORT = 465;
    private static final String HOST = "smtp.gmail.com";
    private static final String USER_LOGIN = "javaszc3@gmail.com";
    private static final String USER_PASSWORD = "java3szc";

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


}

