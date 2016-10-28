/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akmozo.spring.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client extends Utilisateur {

    @ManyToOne
    @JoinColumn(name = "id_conseiller")    // the foreign key name
    private Conseiller conseiller;
    
    public Client() {
    }

    public Client(Integer id, String nom, String prenom, String adresse, String email, String mot_de_passe) {
        super(id, nom, prenom, adresse, email, mot_de_passe);
    }

    public Conseiller getConseiller() {
        return conseiller;
    }

    public void setConseiller(Conseiller conseiller) {
        this.conseiller = conseiller;
    }
    
}
