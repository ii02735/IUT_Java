package Format;

public class StarMin implements IFormat{
//	private Message message;
//	
//	public StarMin(Message message) {
//		this.message = message;
//	}

	@Override
	public String getTexte(String message) { return message.toLowerCase(); }

	@Override
	public String getMotif() { return " * ";}
}
