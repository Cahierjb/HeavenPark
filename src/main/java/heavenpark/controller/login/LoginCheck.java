package heavenpark.controller.login;

import heavenpark.controller.db_access.*;
import heavenpark.model.User;

import java.sql.*;

public class LoginCheck {

    //Attributs recupéré de la page web
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String user_name) {
        this.email = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String user_name) {
        this.password = user_name;
    }

    //Methodes
    public String execute(){
        System.out.println("user_name : " + getEmail() );
        String result="failed";
        boolean status=false;
        try{
            Connection con = ConnectionProvider.getCon();

            PreparedStatement ps=con.prepareStatement(
                    "select * from user where email= '?' and password= '?'");

            ps.setString(1, getEmail());
            ps.setString(2, getPassword());

            System.out.println(ps.toString());
            ResultSet rs=ps.executeQuery();
            status=rs.next();

        }catch(Exception e){
            e.printStackTrace();
        }
        if (status) result ="success";
        System.out.println(result);
        return result;

    }
}