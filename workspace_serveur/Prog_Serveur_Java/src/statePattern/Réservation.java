package statePattern;

import biblioth�que.Abonne;
import biblioth�que.Document;

public class R�servation extends �tat{
	
	@Override
	public �tat emprunt(Abonne a, Document d) {
		System.out.println("Le livre "+ d.numero() + " a �t� emprunt� � au r�servataire abonn� " + a.getNum�ro() );
		return new Emprunt();
	}

	@Override
	public �tat retour(Document d) {
//		"Le document " +l.numero()+" �tant r�serv� ne peut �tre retourn�";
		return null;
	}
	
	@Override
	public �tat r�server(Abonne e,Document d) {
//		Le document " +l.numero()+ " est d�j� sous r�servation;
		return null;
	}


}
