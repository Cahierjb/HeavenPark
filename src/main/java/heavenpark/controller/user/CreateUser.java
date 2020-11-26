package heavenpark.controller.user;

import heavenpark.model.*;
import heavenpark.controller.db_access.DB_Operations;

public class CreateUser {

        private String nom;
        private String prenom;

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

        // All Struts Logic Goes In This Method
        public String execute() {
            Utilisateur myUser = new Utilisateur(nom, prenom);
            if (DB_Operations.Sauvegarder(myUser))return "success";
            else return "failed";
        }
}
