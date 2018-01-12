package bibliotheque;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Abonne {
	
	private boolean estBanni;
	private int numero;
	private Map<Document, GregorianCalendar> dateButoir;
	
	public Abonne(int numero)
	{
		this.setEstBanni(false);
		this.numero = numero;
		this.dateButoir = new HashMap<>();
	}
	
	public int getNumero()
	{
		return this.numero;
	}

	public GregorianCalendar getDateButoir(Document d) {
		return dateButoir.get(d);
	}

	public void addDateButoir(Document d) {
		this.dateButoir.put(d, new GregorianCalendar());
	}

	public boolean isEstBanni() {
		return estBanni;
	}

	public void setEstBanni(boolean estBanni) {
		this.estBanni = estBanni;
	}
}
