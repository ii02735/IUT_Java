package exceptions;

@SuppressWarnings("serial")
public class AbonneBanniException extends Exception {
	
	public String getMessage(){
		return "Vous etes banni : emprunt impossible";
	}
}
