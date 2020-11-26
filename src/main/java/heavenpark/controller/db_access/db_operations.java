package heavenpark.controller.db_access;

import heavenpark.controller.db_access.ConnectionProvider;
import heavenpark.controller.db_access.ListeRequetes;
import heavenpark.model.*;

import java.sql.*;

public final class db_operations implements ListeRequetes {

    private static Connection con = null;

    //Etablissement de la connection
    private void EtablirConnexion(){
        try{
            con = ConnectionProvider.getCon();
        }catch (Exception e){
            System.out.println("Impossible d'etablir la connexion avec la base de données");
            System.exit(1);
        }
    }

    private boolean Ecriture(PreparedStatement requetePrepare){
        try {
            requetePrepare.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("La requete '" + requetePrepare.toString() + "' a echoue");
            ex.printStackTrace();
            return false;
        }
    }

    private ResultSet Lecture(PreparedStatement requetePrepare){
        ResultSet resultat = null;
        try {
            ResultSet rs =  requetePrepare.executeQuery();
        } catch (SQLException ex) {
            System.out.println("La requete '" + requetePrepare.toString() + "' a echoue");
            ex.printStackTrace();
        }
        return resultat;
    }



    public boolean sauvegarder(Utilisateur unUtilisateur){
        try {
            PreparedStatement requetePrepare = null;
            boolean exist = false;

            //Verifaction si Update ou Create
            requetePrepare = con.prepareStatement(Exist_Utilisateur);
            requetePrepare.setInt(1, unUtilisateur.getIdUser());
            ResultSet resultat = Lecture(requetePrepare);
            if (resultat.next()) exist = true;

            //Si l'utilisateur n'existe pas on le créé
            if (!exist){
                requetePrepare = con.prepareStatement(Create_Utilisateur);
                requetePrepare.setString(1, unUtilisateur.getNom());
                requetePrepare.setString(2, unUtilisateur.getPrenom());
                requetePrepare.setDate(3, unUtilisateur.getNaissance());
                requetePrepare.setString(4, unUtilisateur.getEmail());
                requetePrepare.setString(5, unUtilisateur.getPassword());
                if( Ecriture(requetePrepare) ) System.out.println("Utilisateur créé");
                else System.out.println("L'utilisateur n'a pas pu être créé");
            }
            else{//sinon on l'update
                requetePrepare = con.prepareStatement(Update_Utilisateur);
                requetePrepare.setString(1, unUtilisateur.getNom());
                requetePrepare.setString(2, unUtilisateur.getPrenom());
                requetePrepare.setDate(3, unUtilisateur.getNaissance());
                requetePrepare.setString(4, unUtilisateur.getEmail());
                requetePrepare.setString(5, unUtilisateur.getPassword());
                requetePrepare.setInt(6, unUtilisateur.getIdUser());
                if( Ecriture(requetePrepare)) System.out.println("Utilisateur modifié");
                else System.out.println("L'utilisateur n'a pas pu être modifié");
            }
            return true;
        } catch (Exception e) {
            System.out.println("Sauvegarde de la Place " + unUtilisateur.toString() + " impossible" );
            e.printStackTrace();
            return false;
        }
    }

}
