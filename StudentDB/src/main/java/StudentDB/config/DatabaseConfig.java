package StudentDB.config;

public class DatabaseConfig {
    // URL do MySQL: jdbc:mysql://localhost:3306/databaseName
    // URL do H2 z zapisem do plików: jdbc:h2:~/test"

  //  public static final String URL = "jdbc:h2:mem:~/users;DB_CLOSE_DELAY=-1";

    public static final String URL = "jdbc:mysql://localhost:3306/students?useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "marmolada";

}


// w przypadku problemów z time zone, dodac w url bez spacji po nazwie bazy ?useLegacyDatetimeCode=false&serverTimezone=UTC