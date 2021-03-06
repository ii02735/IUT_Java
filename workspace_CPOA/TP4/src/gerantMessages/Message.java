package gerantMessages;

import Format.IFormat;

public class Message {
	
	private IFormat format;
	private String texte;
	
	public Message(String message,IFormat format) {
		this.texte = message;
		this.format = format;
	}
    public String getTexte() 
    { 
    	return format.getTexte(texte); 
    }
    
    public String getMotif()
    {
    	return this.format.getMotif();
    }
    
    @Override
    public String toString() {
    	return format.getMotif() + this.getTexte() + format.getMotif();
    }
}
        