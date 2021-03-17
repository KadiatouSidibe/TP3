package com.example.tp3;

import java.util.ArrayList;

public class Planete {
    private final ArrayList <String> nom;
    private final String[] taille;

    public Planete(ArrayList<String> nomplanette, String[] tailleplaeille){
        this.nom=nomplanette;
        this.taille=tailleplaeille;
    }

    public ArrayList<String> getNom() {
        return nom;
    }

    public String[] getTaille() {
        return taille;
    }
}
