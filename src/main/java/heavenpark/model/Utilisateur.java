package heavenpark.model;

import java.sql.Date;
import java.util.List;

public class Utilisateur {

        //Attributs
        private int idUser;
        private String nom;
        private String prenom;
        private Date naissance;
        private String email;
        private String password;
        private List<Vehicule> cliVehicules;

        //Constructor
        public Utilisateur(String nom, String prenom, Date naissance, String email, String password) {
            this.nom = nom;
            this.prenom = prenom;
            this.naissance = naissance;
            this.email = email;
            this.password = password;
        }

        public Utilisateur(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Utilisateur(int idUser, String nom, String prenom, Date naissance, String email) {
            this.idUser = idUser;
            this.nom = nom;
            this.prenom = prenom;
            this.naissance = naissance;
            this.email = email;
        }

    //Getter et Setter
        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public String getPrenom() {
            return prenom;
        }

        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }

        public Date getNaissance() {
            return naissance;
        }

        public void setNaissance(Date naissance) {
            this.naissance = naissance;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Vehicule> getCliVehicules() {
            return cliVehicules;
        }

        public void setCliVehicules(List<Vehicule> cliVehicules) {
            this.cliVehicules = cliVehicules;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getIdUser() {
        return idUser;
    }

        public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    //Methodes
}


