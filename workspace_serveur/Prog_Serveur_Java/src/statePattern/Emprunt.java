package statePattern;

import bibliothèque.Abonne;
import bibliothèque.Document;

public class Emprunt extends État{
	
	@Override
	public État emprunt(Abonne a,Document d) {
// Le document est déjà emprunté
		return null;
	}

	@Override
	public État retour(Document d) {
		System.out.println("Le document "+ d.numero() + " a été retourné");
		return new Disponible();
	}

	@Override
	public État réserver(Abonne e,Document d) {
//	Le document " + d.numero() + " ne peut être réservé étant déjà emprunté";
		return null;
	}

	
	
}
