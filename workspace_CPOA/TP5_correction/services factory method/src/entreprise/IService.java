package entreprise;

public interface IService {
	String getType();
	String getNom();
	void setNom(String nom);
	IService spawn(String nom) throws ServiceExistantException;
	IPersonnel creerPersonnel(String matricule, String nom);
	void embaucher(String matricule, String nom);
	IPersonnel chercherParMatricule(String matricule);
}