package heavenpark.controller.db_access;

import heavenpark.controller.db_access.ConnectionProvider;
import heavenpark.controller.db_access.ListeRequetes;
import heavenpark.model.*;

import java.sql.*;

public final class DB_Operations implements ListeRequetes {

    private static Connection con = null;

    //Etablissement de la connection
    private static void EtablirConnexion(){
        try{
            con = ConnectionProvider.getCon();
        }catch (Exception e){
            System.out.println("Impossible d'etablir la connexion avec la base de données");
            System.exit(1);
        }
    }

    private static void CoupeConnexion(){
        try{
            ConnectionProvider.EndConnection();
        }catch (Exception e){
            System.out.println("Impossible d'etablir la connexion avec la base de données");
            System.exit(1);
        }
    }



    private static boolean Ecriture(PreparedStatement requetePrepare){
        try {
            requetePrepare.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("La requete '" + requetePrepare.toString() + "' a echoue");
            ex.printStackTrace();
            return false;
        }
    }

    private static ResultSet Lecture(PreparedStatement requetePrepare){
        ResultSet resultat = null;
        try {
            ResultSet rs =  requetePrepare.executeQuery();
        } catch (SQLException ex) {
            System.out.println("La requete '" + requetePrepare.toString() + "' a echoue");
            ex.printStackTrace();
        }
        return resultat;
    }



    public static boolean Sauvegarder(Utilisateur unUtilisateur){
        try {
            EtablirConnexion();
            PreparedStatement requetePrepare = null;
            boolean exist = false;
            System.out.println("test0");
            //Verifaction si Update ou Create
            requetePrepare = con.prepareStatement(Exist_Utilisateur);
            requetePrepare.setInt(1, unUtilisateur.getIdUser());
            ResultSet resultat = Lecture(requetePrepare);
            if (resultat.next()) exist = true;
            System.out.println("test1");
            //Si l'utilisateur n'existe pas on le créé
            if (!exist) {
                requetePrepare = con.prepareStatement(Create_Utilisateur);
                requetePrepare.setString(1, unUtilisateur.getNom());
                requetePrepare.setString(2, unUtilisateur.getPrenom());
                requetePrepare.setDate(3, unUtilisateur.getNaissance());
                requetePrepare.setString(4, unUtilisateur.getEmail());
                requetePrepare.setString(5, unUtilisateur.getPassword());
                if (Ecriture(requetePrepare)) System.out.println("Utilisateur créé");
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
            System.out.println("test2");
            requetePrepare.close();
            CoupeConnexion();
            return true;
        } catch (Exception e) {
            System.out.println("Sauvegarde de l'utilisateur " + unUtilisateur.toString() + " impossible" );
            e.printStackTrace();
            return false;
        }
    }

    public Utilisateur ChargerUtilisateur(int idUtilisateur) {
        PreparedStatement requetePrepare = null;
        Utilisateur newUser = null;
        try {
            EtablirConnexion();
            requetePrepare = con.prepareStatement(Select_Utilisateur);
            requetePrepare.setInt(1, idUtilisateur);
            ResultSet resultatRequete = Lecture(requetePrepare);
            while (resultatRequete.next()) {
                String nom = resultatRequete.getString(1);
                String prenom = resultatRequete.getString(2);
                Date naissance = resultatRequete.getDate(3);
                String email = resultatRequete.getString(4);
                newUser = new Utilisateur(idUtilisateur, nom, prenom, naissance, email);
            }
            requetePrepare.close();
            CoupeConnexion();
        } catch (Exception e) {
            System.out.println("Chargement de l'utilidsateur " + idUtilisateur + " impossible");
            e.printStackTrace();
        }
        return  newUser;
    }
}
