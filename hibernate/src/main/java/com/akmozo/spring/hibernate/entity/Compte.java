
package com.akmozo.spring.hibernate.entity;

import java.util.List;
import javax.persistence.*;

@Table(name = "compte")
public class Compte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // identity : by the server, auto: by hibernate
    @Column(name = "num", nullable = false)    
    private Integer num;
    
    @Column(name = "libelle", nullable = false, length = 50)
    private String libelle;
    
    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;
    
    @OneToMany(mappedBy = "compte")
    private List<Operation> operations;

    public Compte() {
    }

    public Compte(Integer num, String libelle, Client client, List<Operation> operations) {
        this.num = num;
        this.libelle = libelle;
        this.client = client;
        this.operations = operations;
    }
    
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }    
    
}
