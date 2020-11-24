package heavenpark.controller.login;

import heavenpark.controller.db_access.*;
import heavenpark.model.User;

import java.sql.*;

public class LoginCheck {

    //Attributs recupéré de la page web
    private String email;
    private String password;

    //Methodes
    public String validate(){
        String result="failed";
        boolean status=false;
        try{
            Connection con=ConnectionProvider.getCon();

            PreparedStatement ps=con.prepareStatement(
                    "select email, password from user where email=? and password=?");

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs=ps.executeQuery();
            status=rs.next();

        }catch(Exception e){}
        if (status) result ="success";
        return result;

    }
}