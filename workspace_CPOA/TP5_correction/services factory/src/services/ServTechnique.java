package services;

import entreprise.IService;


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
}
