package statePattern;

import bibliothèque.Abonne;
import bibliothèque.Document;

public class Réservation extends État{
	
	@Override
	public État emprunt(Abonne a, Document d) {
		System.out.println("Le livre "+ d.numero() + " a été emprunté à au réservataire abonné " + a.getNuméro() );
		return new Emprunt();
	}

	@Override
	public État retour(Document d) {
//		"Le document " +l.numero()+" étant réservé ne peut être retourné";
		return null;
	}
	
	@Override
	public État réserver(Abonne e,Document d) {
//		Le document " +l.numero()+ " est déjà sous réservation;
		return null;
	}


}
