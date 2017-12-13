package services;

import entreprise.IService;
import personnel.Personnel;

public class ServCommercial extends Service{

	public ServCommercial(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Commercial";
	}

	@Override
	public IService spawn(String nom) {
		// TODO Auto-generated method stub
		return new ServCommercial(nom);
	}

	@Override
	public Personnel embaucherPersonnel(String matricule, String nom) {
		// TODO Auto-generated method stub
		return new ;
	}

}
