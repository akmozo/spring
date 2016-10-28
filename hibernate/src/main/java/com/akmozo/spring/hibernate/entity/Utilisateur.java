
package com.akmozo.spring.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

// using DiscriminatorColumn et DiscriminatorValue dans Etudiant et Formateur
// il ajoute une column pour faire la diff entre etudiant et formateur
// on disactivant cela, hibernate va cree une colonne DTYPE qui va faire le meme role
@DiscriminatorColumn(name = "type")
public class Utilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity : by the server, auto: by hibernate
    @Column(name = "id", nullable = false)
    private Integer id;     // on n'utilise pas int car int a une valeur par défaut : 0
    
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    
    @Column(name = "prenom", nullable = false, length = 50)
    private String prenom;
    
    @Column(name = "adresse", nullable = false, length = 50)
    private String adresse;
    
    @Column(name = "email", nullable = false, length = 200)
    private String email; 
    
    @Column(name = "motdepasse", nullable = false, length = 200)
    private String mot_de_passe;

    //@Column(insertable = false, updatable = false)
    //private String type;

    public Utilisateur() {
    }

    public Utilisateur(Integer id, String nom, String prenom, String adresse, String email, String mot_de_passe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.mot_de_passe = mot_de_passe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }
    
    
}
