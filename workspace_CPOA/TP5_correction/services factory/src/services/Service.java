package services;

import entreprise.IService;


public abstract class Service implements IService {
	private String nom ;
	
	public Service (String nom) {
		this.nom = nom;
	}

	@Override
	public abstract String getType();
	

	@Override
	public String getNom(){
		return this.nom;
	}

	@Override
	public void setNom(String nom){
		this.nom = nom ;
	}

	@Override
	public abstract IService spawn(String nom); 
}
