package composite;

import exceptions.CasException;

public interface Groupement {
	
	void ajouter(Groupement g) throws CasException;
	int getSalaire();
}
