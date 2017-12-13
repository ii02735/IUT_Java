package services;

import entreprise.IPersonnel;

public class Personnel implements IPersonnel {
    private String matricule;
    private String nom;
    public Personnel(String matricule, String nom) {
        this.matricule = matricule;
        this.nom = nom;
    }

    @Override
	public String getNom() { return nom;}

    @Override
	public String getMatricule() {return matricule;}
}

