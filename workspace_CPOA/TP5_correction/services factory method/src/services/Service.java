package services;

import java.util.ArrayList;
import java.util.List;

import entreprise.IPersonnel;
import entreprise.IService;


public abstract class Service implements IService {
	private String nom ;
	private List<IPersonnel> employes = new ArrayList<>();
	
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
	
	public IPersonnel chercherParMatricule(String matricule) {
        for (IPersonnel p : employes)
            if (p.getMatricule().equals(matricule))
                return p;
        return null;
    }
	
    public void embaucher(String matricule, String nom) {
        assert chercherParMatricule(matricule) == null : "matricule deja dans le service";
        employes.add(creerPersonnel(matricule, nom));
    }
}
