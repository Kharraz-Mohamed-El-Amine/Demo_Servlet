package Models;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String cne;
    private String nom;
    private String prenom;
    private String filiere;

    public Etudiant() {
    }

    public Etudiant(String cne, String nom, String prenom, String filiere) {
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

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

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "cne='" + cne + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", filiere='" + filiere + '\'' +
                '}';
    }
}