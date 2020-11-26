package heavenpark.controller.db_access;

import heavenpark.model.*;

public interface ListeRequetes {

    String Exemple = "select * from user where email= '?' and password= '?'";

    //Utilisateur
    String Exist_Utilisateur =
            "SELECT idUser " +
            "FROM utilisateur where idUser = '?'";

    String Update_Utilisateur =
            "UPDATE utilisateur"+
            "SET prenom = ''?''"+
            "SET nom = ''?''"+
            "SET naissance = ''?''"+
            "SET email = ''?''" +
            "SET password = ''?''" +
            "WHERE idUser = '?'";

    String Create_Utilisateur =
            "INSERT INTO utilisateur (nom, prenom, naissance, email, password) VALUES ('?','?','?','?','?','?')";

    //Place
    String Exist_Place =
            "SELECT idUser " +
                    "FROM utilisateur where idUser = '?'";

    String Update_Place =
            "UPDATE utilisateur"+
                    "SET prenom = ''?''"+
                    "SET nom = ''?''"+
                    "SET naissance = ''?''"+
                    "SET email = ''?''" +
                    "SET password = ''?''" +
                    "WHERE idUser = '?'";

    String Create_Place =
            "INSERT INTO utilisateur (nom, prenom, naissance, email, password) VALUES ('?','?','?','?','?','?')";

    //Parking
    String Exist_Parking =
            "SELECT idUser " +
                    "FROM utilisateur where idUser = '?'";

    String Update_Parking =
            "UPDATE utilisateur"+
                    "SET prenom = ''?''"+
                    "SET nom = ''?''"+
                    "SET naissance = ''?''"+
                    "SET email = ''?''" +
                    "SET password = ''?''" +
                    "WHERE idUser = '?'";

    String Create_Parking =
            "INSERT INTO utilisateur (nom, prenom, naissance, email, password) VALUES ('?','?','?','?','?','?')";

    //Voiture
    String Exist_Voiture =
            "SELECT idUser " +
                    "FROM utilisateur where idUser = '?'";

    String Update_Voiture =
            "UPDATE utilisateur"+
                    "SET prenom = ''?''"+
                    "SET nom = ''?''"+
                    "SET naissance = ''?''"+
                    "SET email = ''?''" +
                    "SET password = ''?''" +
                    "WHERE idUser = '?'";

    String Create_Voiture =
            "INSERT INTO utilisateur (nom, prenom, naissance, email, password) VALUES ('?','?','?','?','?','?')";
}
