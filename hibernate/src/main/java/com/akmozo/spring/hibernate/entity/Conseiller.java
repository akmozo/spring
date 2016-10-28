
package com.akmozo.spring.hibernate.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Conseiller extends Utilisateur { 
    
    @OneToMany(mappedBy = "conseiller")
    private List<Client> clients;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
}
