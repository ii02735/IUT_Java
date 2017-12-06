package gerantMessages;

public class Message {
	private String texte;
    private IFormat format;  

    public Message(String texte, IFormat format) {
    	this.texte = texte;
        this.format = format;
    }
    public void setFormat(IFormat format) {
    	this.format = format;
    }
    
    @Override
    public  String toString() {
    	 return format.getMotif()
    		  + format.getTexteAvecFormat(texte)
    		  + format.getMotif();
    }  
}
