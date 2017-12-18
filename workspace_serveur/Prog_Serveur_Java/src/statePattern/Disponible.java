package statePattern;

import bibliothèque.Abonne;
import bibliothèque.Document;

public class Disponible extends État{

	@Override
	public État emprunt(Abonne a,Document d) {
		System.out.println("L'abonné " + a.getNuméro() + " emprunte le document " + d.numero());
		return new Emprunt();
	}

	@Override
	public État retour(Document l) {
//		Le document ne peut être retourné étant déjà disponible;
		return null;
	}

	@Override
	public État réserver(Abonne e, Document d) {
		System.out.println("Le document "+d.numero()+ " est désormais réservé à l'abonné " + e.getNuméro());
		return new Réservation();
	}



}
