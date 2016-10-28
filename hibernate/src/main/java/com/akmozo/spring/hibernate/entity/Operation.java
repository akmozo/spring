
package com.akmozo.spring.hibernate.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "operation")
public class Operation {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity : by the server, auto: by hibernate
    @Column(name = "id", nullable = false)     
    private Integer id;     // on n'utilise pas int car int a une valeur par défaut : 0
    
    @Column(name = "montant")
    private Double montant;
    
    @Column(name = "type", nullable = false, length = 50)    
    private String type;
    
    @Column(name = "date", nullable = false)    
    private Date date;    
    
    @ManyToOne
    @JoinColumn(name = "num_compte")    // the foreign key name
    private Compte compte;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Operation(Integer id, Double montant, String type, Compte compte) {
        this.id = id;
        this.montant = montant;
        this.type = type;
        this.compte = compte;
    }
    public Operation() {
    }
    
    
    
}
