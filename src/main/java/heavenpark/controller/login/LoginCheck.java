package heavenpark.controller.login;

import heavenpark.controller.db_access.*;

import java.sql.*;

import static heavenpark.controller.db_access.ListeRequetes.*;

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
        String result="failed";
        boolean status=false;
        int admin = 0;
        try{
            Connection con = ConnectionProvider.getCon();

            PreparedStatement ps = con.prepareStatement(login);
            System.out.println(email +" "+ password);
            ps.setString(1, getEmail());
            ps.setString(2, getPassword());

            ResultSet rs=ps.executeQuery();
            ps.toString();
            status=rs.next();
            if (status) admin = rs.getInt(8);
            ps.close();

        }catch(Exception e){
            e.printStackTrace();
        }
        if (status && admin == 1 ) result ="success_admin";
        else if(status && admin != 1 )  result = "success";
        System.out.println(result);
        return result;

    }
}