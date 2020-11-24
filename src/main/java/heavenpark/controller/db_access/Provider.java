package heavenpark.controller.db_access;

public interface Provider {
    String DRIVER="mysql.jdbc.driver.OracleDriver";
    String CONNECTION_URL="jdbc:oracle:thin:@localhost:1521:xe";
    String USERNAME="system";
    String PASSWORD="oracle";

}