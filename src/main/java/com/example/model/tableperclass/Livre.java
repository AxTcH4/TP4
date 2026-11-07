package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Livre extends Produit {

    private String auteur;

    public Livre() {}

    @Override
    public double getPrix() {
        return 0;
    }

    public Livre(String nom, String auteur) {
        super(nom);
        this.auteur = auteur;
    }

    // getters et setters
    public String getAuteur() {
        return auteur;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

}