package heavenpark.controller.user;

import heavenpark.model.*;
import heavenpark.controller.db_access.DB_Operations;

import java.sql.Date;

public class CreateUser {

        private String nom;
        private String prenom;
        private Date naissance;
        private String email;
        private String password;

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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    // All Struts Logic Goes In This Method
        public String execute() {
            Utilisateur myUser = new Utilisateur(nom, prenom, naissance, email, password);
            if (DB_Operations.Sauvegarder(myUser)){System.out.println("success"); return "success";
                }
            else {
                System.out.println("failed"); return "failed";}
        }
}
