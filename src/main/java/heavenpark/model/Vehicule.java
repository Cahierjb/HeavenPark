package heavenpark.model;

import java.awt.*;

public class Vehicule {

    //Attributs
    private String immatriculation;
    private Color couleur;
    private String marques;
    private String modele;
    private String type;
    private int idUser;
    private int idPlace;

    //Constructor
    public Vehicule(String immatriculation, Color couleur, String marques, String modele, String type) {
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

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
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
}
