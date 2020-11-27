package heavenpark.model;

import java.awt.*;

public class Vehicule {

    //Attributs
    private String immatriculation;
    private String couleur;
    private String marques;
    private String modele;
    private String type;
    private int idUser;
    private int idPlace;

    //Constructor
    public Vehicule(String immatriculation, String couleur, String marques, String modele, String type) {
        this.immatriculation = immatriculation;
        this.couleur = couleur;
        this.marques = marques;
        this.modele = modele;
        this.type = type;
    }

    //Getter et Setter

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

    public String getMarques() {
        return marques;
    }

    public void setMarques(String marques) {
        this.marques = marques;
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

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }
}
