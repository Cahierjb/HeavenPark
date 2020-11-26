package heavenpark.controller.db_access;

import java.awt.Color;

import heavenpark.model.*;

public interface ListeRequetes {

    String Exemple = "select * from user where email= ? and password= ?";

    //Utilisateur
    String Exist_Utilisateur =
            "SELECT idUser " +
            "FROM utilisateur where idUser = ?";

    String Update_Utilisateur =
            "UPDATE utilisateur "+
            "SET prenom = ? "+
            "SET nom = ? "+
            "SET naissance = ? "+
            "SET email = ? " +
            "SET password = ? " +
            "WHERE idUser = ?";

    String Create_Utilisateur =
            "INSERT INTO utilisateur (nom, prenom, naissance, email, password) VALUES (?,?,?,?,?)";

    String Select_Utilisateur =
            "SELECT * "+
            "FROM utilisateur "+
            "WHERE idUser = ?";

    //Place
    String Exist_Place =
            "SELECT idPlace " +
                    "FROM place where idPlace = ?";

    String Update_Place =
            "UPDATE Place"+
                    "SET Pris = ?"+
                    "SET Etage = ?"+
                    "SET Allee = ?" +
                    "SET idParking = ?" +
                    "WHERE idPlace = ?";

    String Create_Place =
            "INSERT INTO Place (idPlace, Pris, Etage, Allee, idParking) VALUES (?,?,?,?,?)";

    String Select_Place =
            "SELECT * "+
                    "FROM Placer "+
                    "WHERE idPlace = ?";

    //Parking
    String Exist_Parking =
            "SELECT idParking " +
                    "FROM Parking where idParking = ?";

    String Update_Parking =
            "UPDATE Parking"+
                    "SET nom= ?"+
                    "SET nbEtage = ?"+
                    "SET nbAllee = ?"+
                    "SET placeMax = ?" +
                    "WHERE idParking = ?";

    String Create_Parking =
            "INSERT INTO Parking (idParking, nom, nbEtage, placeMax) VALUES (?,?,?,?)";

    String Select_Parking =
            "SELECT * "+
                    "FROM Parking "+
                    "WHERE idParking = ?";

    //Voiture
    String Exist_Voiture =
            "SELECT idVoiture " +
                    "FROM Voiture where idVoiture = ?";

    String Update_Voiture = 
            "UPDATE Voiture"+
                    "SET immatriculation = ?"+
                    "SET couleur = ?"+
                    "SET marques = ?"+
                    "SET modele = ?" +
                    "SET type = ?" +
                    "WHERE idVoiture = ?";

    String Create_Voiture =
            "INSERT INTO Voiture (immatriculation, couleur, marques, modele, type) VALUES (?,?,?,?,?)";

    String Select_voiture =
            "SELECT * "+
                    "FROM Voiture "+
                    "WHERE idVoiture = ?";
}
