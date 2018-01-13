package exceptions;

@SuppressWarnings("serial")
public class DejaLibreException extends Exception {
	
	public String getMessage()
	{
		return "Le document n'est pas emprunté";
	}
}
