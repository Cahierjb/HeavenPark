package heavenpark.controller.user;

import heavenpark.model.*;
import heavenpark.controller.db_access.DB_Operations;

import java.sql.Date;

public class CreateVehicule {

    private String immatriculation;
    private String couleur;
    private String marque;
    private String modele;
    private String type;

    private int idParking;
    private int etage;
    private int allee;

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdParking() {
        return idParking;
    }

    public void setIdParking(int idParking) {
        this.idParking = idParking;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }

    public int getAllee() {
        return allee;
    }

    public void setAllee(int allee) {
        this.allee = allee;
    }

    // All Struts Logic Goes In This Method
    public String execute() {
        System.out.println("immat:"+ immatriculation);
        Vehicule myVehicle = new Vehicule(immatriculation, couleur, marque, modele, type);
        Place myPlace = new Place(etage, allee, idParking);
        myPlace.setPris(true);
        myVehicle.setIdPlace(myPlace.getidPlace());
        if (DB_Operations.Sauvegarder(myVehicle) && DB_Operations.Sauvegarder(myPlace)){
            System.out.println("success"); return "success";
        }
        else {
            System.out.println("failed"); return "failed";
        }
    }

}
