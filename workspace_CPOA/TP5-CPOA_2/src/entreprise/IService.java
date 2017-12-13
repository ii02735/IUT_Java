package entreprise;

import personnel.Personnel;

public interface IService {
	String getType();
	String getNom();
	void setNom(String nom);
	IService spawn(String nom) throws ServiceExistantException;
	Personnel embaucherPersonnel(String matricule,String nom);


}