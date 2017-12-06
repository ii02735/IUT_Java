package airCountry;

public class VolPassager {
	
	private Aeroport depart; 
	private Aeroport destination;
	
	public VolPassager(Aeroport depart, Aeroport destination) {	
		this.depart = depart;
		this.destination = destination;
	}
	
	public Aeroport getDepart(){
		return this.depart;
	}
	
	public Aeroport getDestination(){
		return this.destination;
	}
}
