package bibliotheque;

import exceptions.PasLibreException;

public interface Document {
	int numero();
	void reserver(Abonne ab)throws PasLibreException;
	void emprunter(Abonne ab)throws PasLibreException;
	void retour(boolean estAbimé);// document rendu on annulation reservation
}
