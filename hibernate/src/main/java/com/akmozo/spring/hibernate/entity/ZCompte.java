
package com.akmozo.spring.hibernate.entity;

import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "compte")
public class ZCompte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity : by the server, auto: by hibernate
    @Column(name = "num", nullable = false)    
    private Integer num;
    
    @Column(name = "libelle", nullable = false, length = 50)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "id_personne")
    private Personne personne;
    
    //@OneToMany(mappedBy = "compte")
    //private Set<Operation> operations;

    public ZCompte(Integer num, String libelle, Personne personne) {
        this.num = num;
        this.libelle = libelle;
        this.personne = personne;
    }
    public ZCompte() {
    }    

    /*public Set<Operation> getOperations() {
        return operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }*/

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
    
    
}
