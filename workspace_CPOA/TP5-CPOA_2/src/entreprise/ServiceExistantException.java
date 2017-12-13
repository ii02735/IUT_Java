package entreprise;


@SuppressWarnings("serial")
public class ServiceExistantException extends RuntimeException {
	public ServiceExistantException(String nom) {
		super(nom);	
	}
}
