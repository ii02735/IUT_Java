package entreprise;

public interface IService {
	String getType();
	String getNom();
	void setNom(String nom);
	IService spawn(String nom) throws ServiceExistantException;

}