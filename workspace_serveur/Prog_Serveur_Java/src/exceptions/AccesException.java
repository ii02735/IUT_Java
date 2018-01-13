package exceptions;

@SuppressWarnings("serial")
public class AccesException extends Exception{
	
	public String getMessage()
	{
		return "Service non répertorié";
	}
}
