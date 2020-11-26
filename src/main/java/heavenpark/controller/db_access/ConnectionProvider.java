package heavenpark.controller.db_access;

import java.sql.*;
import static heavenpark.controller.db_access.Provider.*;

public class ConnectionProvider {
    private static Connection con=null;
    static{
        try{
            Class.forName(DRIVER);
            con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
        }catch(Exception e){}
    }

    public static Connection getCon(){
        return con;
    }

    //Libération des ressources
    public static boolean EndConnection() {
        try {
            con.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}