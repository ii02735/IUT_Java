package exception;

@SuppressWarnings("serial")
public class PasLibreException extends Exception{
	
	private String message;
	
	public PasLibreException(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}
