package heavenpark.model;

import java.sql.Date;
import java.util.List;

public class User {

        //Attributs
        private String nom;
        private String prenom;
        private Date naissance;
        private String email;
        private String password;
        private List<vehicule> cliVehicules;

        //Constructor
        public User(String nom, String prenom, Date naissance, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.naissance = naissance;
            this.email = email;
        }

        public User(String email, String password) {
            this.email = email;
            this.password = password;
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

        public List<vehicule> getCliVehicules() {
            return cliVehicules;
        }

        public void setCliVehicules(List<vehicule> cliVehicules) {
            this.cliVehicules = cliVehicules;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        //Methodes
}


