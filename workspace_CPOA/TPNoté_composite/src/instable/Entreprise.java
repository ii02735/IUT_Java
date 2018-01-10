package instable;

import java.util.ArrayList;
import java.util.List;

import composite.Groupement;

public class Entreprise implements Groupement{
	private List<Groupement> cas = new ArrayList<>();
	
	public void ajouter(Groupement s) { 
		cas.add(s); 
	}
	public int getSalaire() {
		int total = 0;
		for(Groupement g : cas)
			total += g.getSalaire();
		return total;
	}
}