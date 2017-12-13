package services;

import java.util.ArrayList;
import java.util.List;

import entreprise.IService;
import personnel.IPersonnel;



public abstract class Service implements IService {
	private String nom;
	private List<IPersonnel> _perso = new ArrayList<>();

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
	public abstract IService spawn(String nom); //spécifique au pattern prototype

	public void embaucher(String matricule,String nom)
	{
		this._perso.add(embaucherPersonnel(matricule, nom));
	}
	
	public IPersonnel searchPersoByMat(String matricule){
		for(IPersonnel perso:this._perso)
			if(perso.getMatricule().equals(matricule))
				return perso;
		return null;
	}
	
}
