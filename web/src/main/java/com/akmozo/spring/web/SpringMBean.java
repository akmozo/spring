package com.akmozo.spring.web;

import com.akmozo.spring.hibernate.dao.IPersonneDAO;
import com.akmozo.spring.hibernate.entity.ZCompte;
import com.akmozo.spring.hibernate.entity.Personne;
import java.util.Set;

import javax.faces.bean.ManagedProperty;

public class SpringMBean {

    private Personne persInsert = new Personne();
    private Set<Personne> personnes;
    private Set<ZCompte> comptesSelected;
    private Personne persSelected;

    @ManagedProperty(value = "#{personneDAOTX}")
    private IPersonneDAO dao;

    public void ajouter() {
        persInsert = dao.add(persInsert);
    }

    public void rechercher() {
        //personnes = dao.search(persInsert.getNom());
        if (personnes.size() > 0) {
            //persSelected = personnes.get(0);
            //comptesSelected = persSelected.getComptes();
        }
    }

    public void afficherComptes(Personne pers) {
        comptesSelected = pers.getComptes();
    }

    public void setDao(IPersonneDAO dao) {
        this.dao = dao;
    }

    public Personne getPersInsert() {
        return persInsert;
    }

    public void setPersInsert(Personne persInsert) {
        this.persInsert = persInsert;
    }

    public Set<Personne> getPersonnes() {
        return personnes;
    }

    public void setPersonnes(Set<Personne> personnes) {
        this.personnes = personnes;
    }

    public Set<ZCompte> getComptesSelected() {
        return comptesSelected;
    }

    public void setComptesSelected(Set<ZCompte> comptesSelected) {
        this.comptesSelected = comptesSelected;
    }

    public Personne getPersSelected() {
        return persSelected;
    }

    public void setPersSelected(Personne persSelected) {
        this.persSelected = persSelected;
    }
}
