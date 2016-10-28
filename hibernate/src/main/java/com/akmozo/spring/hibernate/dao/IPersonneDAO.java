
package com.akmozo.spring.hibernate.dao;

import com.akmozo.spring.hibernate.entity.Client;
import com.akmozo.spring.hibernate.entity.Personne;
import java.util.List;

public interface IPersonneDAO {
    
    Client addClient(Client client);
    
    Personne add(Personne personne);
    Personne delete(Personne personne);
    List<Personne> search(String term);
    
}
