package services;

import entreprise.IService;
import personnel.Personnel;
import personnel.Technique;


public class ServTechnique extends Service {
	public ServTechnique (String nom) {
		super(nom);		
	}	
	
	@Override
	public String getType() {	
		return "Technique";
	}
	
	@Override
	public IService spawn(String nom) {
		return new ServTechnique(nom);
	}
	
	@Override
	public Personnel embaucherPersonnel(String matricule,String nom) {
		// TODO Auto-generated method stub
		return new Technique(matricule, nom);
		
	}	
}
