package statePattern;

import biblioth�que.Abonne;
import biblioth�que.Document;

public class Disponible extends �tat{

	@Override
	public �tat emprunt(Abonne a,Document d) {
		System.out.println("L'abonn� " + a.getNum�ro() + " emprunte le document " + d.numero());
		return new Emprunt();
	}

	@Override
	public �tat retour(Document l) {
//		Le document ne peut �tre retourn� �tant d�j� disponible;
		return null;
	}

	@Override
	public �tat r�server(Abonne e, Document d) {
		System.out.println("Le document "+d.numero()+ " est d�sormais r�serv� � l'abonn� " + e.getNum�ro());
		return new R�servation();
	}



}
