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
           
        } catch (Exception e) {
            System.out.println("Chargement de l'utilidsateur " + idUtilisateur + " impossible");
            e.printStackTrace();
        }
        return  newUser;
    }
    
    public static boolean Sauvegarder(Parking unParking){
        try {
            EtablirConnexion();
            PreparedStatement requetePrepare = null;
            boolean exist = false;
            System.out.println("test0");
            //Verifaction si Update ou Create
            requetePrepare = con.prepareStatement(Exist_Utilisateur);
            requetePrepare.setInt(1, unParking.GetidParking());
            ResultSet resultat = Lecture(requetePrepare);
            if (resultat.next()) exist = true;
            System.out.println("test1");
            //Si l'utilisateur n'existe pas on le créé
            if (!exist) {
                requetePrepare = con.prepareStatement(Create_Utilisateur);
                requetePrepare.setString(1, unParking.getNom());
                requetePrepare.setString(2, unParking.getEtage());
                requetePrepare.setDate(3, unParking.getnbAllee());
                requetePrepare.setString(4, unParking.GetPlaceMax());
                requetePrepare.setString(5, unParking.GetPlaceUtilise());
                if (Ecriture(requetePrepare)) System.out.println("Parking créé");
                else System.out.println("Le parking n'a pas pu être créé");
            }
            else{//sinon on l'update
                requetePrepare = con.prepareStatement(Update_Utilisateur);
                requetePrepare.setString(1, unParking.getNom());
                requetePrepare.setString(2, unParking.getEtage());
                requetePrepare.setDate(3, unParking.getnbAllee());
                requetePrepare.setString(4, unParking.GetPlaceMax());
                requetePrepare.setString(5, unParking.GetPlaceUtilise());
                requetePrepare.setInt(6, unParking.GetidParking());
                if( Ecriture(requetePrepare)) System.out.println("Parking modifié");
                else System.out.println("Le Parking n'a pas pu être modifié");
            }
            System.out.println("test2");
            requetePrepare.close();
            
            return true;
        } catch (Exception e) {
            System.out.println("Sauvegarde du Parking " + unParking.toString() + " impossible" );
            e.printStackTrace();
            return false;
        }
    }
    public Parking ChargerParking(int idParking) {
        PreparedStatement requetePrepare = null;
        Parking newParking = null;
        try {
            EtablirConnexion();
            requetePrepare = con.prepareStatement(Select_Parking);
            requetePrepare.setInt(1, idParking);
            ResultSet resultatRequete = Lecture(requetePrepare);
            while (resultatRequete.next()) {
                String nom = resultatRequete.getString(1);
                int nbEtage = resultatRequete.getInt(2);
                int nbAllee = resultatRequete.getInt(3);
                int placeMax = resultatRequete.getInt(4);
                int placeUtilise = resultatRequete.getInt(5);
                newParking = new Parking(idParking, nom, nbEtage, nbAllee, placeMax, placeUtilise); 
            }
            requetePrepare.close();
           
        } catch (Exception e) {
            System.out.println("Chargement du Parking " + idParking + " impossible");
            e.printStackTrace();
        }
        return  newParking;
    }
    
    public static boolean Sauvegarder(Vehicule unVehicule){
        try {
            EtablirConnexion();
            PreparedStatement requetePrepare = null;
            boolean exist = false;
            System.out.println("test0");
            //Verifaction si Update ou Create
            requetePrepare = con.prepareStatement(Exist_Voiture);
            requetePrepare.setString(1, unVehicule.getImmatriculation());
            ResultSet resultat = Lecture(requetePrepare);
            if (resultat.next()) exist = true;
            System.out.println("test1");
            //Si l'utilisateur n'existe pas on le créé
            if (!exist) {
                requetePrepare = con.prepareStatement(Create_Voiture);
                requetePrepare.setString(1, unVehicule.getImmatriculation());
                requetePrepare.setString(2, unVehicule.getCouleur());
                requetePrepare.setString(3, unVehicule.getMarques());
                requetePrepare.setString(4, unVehicule.getModele());
                requetePrepare.setString(5, unVehicule.getType());
                if (Ecriture(requetePrepare)) System.out.println("Vehicule créé");
                else System.out.println("Le V�hicule n'a pas pu être créé");
            }
            else{//sinon on l'update
            	requetePrepare = con.prepareStatement(Create_Voiture);
                requetePrepare.setString(1, unVehicule.getImmatriculation());
                requetePrepare.setString(2, unVehicule.getCouleur());
                requetePrepare.setString(3, unVehicule.getMarques());
                requetePrepare.setString(4, unVehicule.getModele());
                requetePrepare.setString(5, unVehicule.getType());
                if (Ecriture(requetePrepare)) System.out.println("Vehicule créé");
                else System.out.println("Le V�hicule n'a pas pu être modifié");
            }
            System.out.println("test2");
            requetePrepare.close();
      
            return true;
        } catch (Exception e) {
            System.out.println("Sauvegarde du Vehicule " + unVehicule.toString() + " impossible" );
            e.printStackTrace();
            return false;
        }
    }
    
    public Vehicule ChargerVehicule(int Immatriculation) {
        PreparedStatement requetePrepare = null;
        Vehicule newVehicule = null;
        try {
            EtablirConnexion();
            requetePrepare = con.prepareStatement(Select_voiture);
            requetePrepare.setInt(1, Immatriculation);
            ResultSet resultatRequete = Lecture(requetePrepare);
            while (resultatRequete.next()) {
                String immatriculation = resultatRequete.getString(1);
                String Couleur = resultatRequete.getString(2);
                String Marques= resultatRequete.getString(3);
                String Modele = resultatRequete.getString(4);
                String Type = resultatRequete.getString(5);
                newVehicule = new Vehicule(immatriculation, Couleur, Marques, Modele, Type); 
            }
            requetePrepare.close();
           
        } catch (Exception e) {
            System.out.println("Chargement du Vehicule " + Immatriculation + " impossible");
            e.printStackTrace();
        }
        return  newVehicule;
    }
    
    
    public static boolean Sauvegarder(Place unPlace){
        try {
            EtablirConnexion();
            PreparedStatement requetePrepare = null;
            boolean exist = false;
            System.out.println("test0");
            //Verifaction si Update ou Create
            requetePrepare = con.prepareStatement(Exist_Place);
            requetePrepare.setInt(1, unPlace.getidPlace());
            ResultSet resultat = Lecture(requetePrepare);
            if (resultat.next()) exist = true;
            System.out.println("test1");
            //Si l'utilisateur n'existe pas on le créé
            if (!exist) {
                requetePrepare = con.prepareStatement(Create_Place);
                requetePrepare.setInt(1, unPlace.getidPlace());
                requetePrepare.setBoolean(2, unPlace.isPris());
                requetePrepare.setInt(3, unPlace.getEtage());
                requetePrepare.setInt(4, unPlace.getAllee());
                requetePrepare.setInt(4, unPlace.getidParking());
                if (Ecriture(requetePrepare)) System.out.println("Place créé");
                else System.out.println("La Place n'a pas pu être créé");
            }
            else{//sinon on l'update
            	requetePrepare = con.prepareStatement(Create_Place);
                requetePrepare.setInt(1, unPlace.getidPlace());
                requetePrepare.setBoolean(2, unPlace.isPris());
                requetePrepare.setInt(3, unPlace.getEtage());
                requetePrepare.setInt(4, unPlace.getAllee());
                requetePrepare.setInt(4, unPlace.getidParking());
                if (Ecriture(requetePrepare)) System.out.println("Place créé");
                else System.out.println("La Place n'a pas pu être modifié");
            }
            System.out.println("test2");
            requetePrepare.close();
      
            return true;
        } catch (Exception e) {
            System.out.println("Sauvegarde de la place " + unPlace.toString() + " impossible" );
            e.printStackTrace();
            return false;
        }
    }
    
    public Place ChargerPlace(int idPlace) {
        PreparedStatement requetePrepare = null;
        Place newPlace = null;
        try {
            EtablirConnexion();
            requetePrepare = con.prepareStatement(Select_Place);
            requetePrepare.setInt(1, idPlace);
            ResultSet resultatRequete = Lecture(requetePrepare);
            while (resultatRequete.next()) {
            	int idplace = resultatRequete.getInt(1);
                boolean pris = resultatRequete.getBoolean(2);
                int etage= resultatRequete.getInt(3);
                int allee = resultatRequete.getInt(4);
                int idpark = resultatRequete.getInt(5);
                newPlace = new Place(idplace, pris, etage, allee,idpark); 
            }
            requetePrepare.close();
           
        } catch (Exception e) {
            System.out.println("Chargement du Vehicule " + idPlace + " impossible");
            e.printStackTrace();
        }
        return  newPlace;
    }
}
