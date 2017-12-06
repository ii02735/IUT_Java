package airCountry;

public class AirCountry {
	
	public static int distanceVol (VolPassager vol) {
		Aeroport dept = vol.getDepart();
		Aeroport dest = vol.getDestination(); 
		return(Math.abs(dest.getCoordonnées() - dept.getCoordonnées()));
	}
}
