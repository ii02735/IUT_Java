package entreprise;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

@SuppressWarnings("serial")
public class ServiceExistantException extends Exception {

	public ServiceExistantException(String nom) {
		super(nom);	
	}
}
