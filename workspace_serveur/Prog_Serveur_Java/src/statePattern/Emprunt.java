package statePattern;

import biblioth�que.Abonne;
import biblioth�que.Document;

public class Emprunt extends �tat{
	
	@Override
	public �tat emprunt(Abonne a,Document d) {
// Le document est d�j� emprunt�
		return null;
	}

	@Override
	public �tat retour(Document d) {
		System.out.println("Le document "+ d.numero() + " a �t� retourn�");
		return new Disponible();
	}

	@Override
	public �tat r�server(Abonne e,Document d) {
//	Le document " + d.numero() + " ne peut �tre r�serv� �tant d�j� emprunt�";
		return null;
	}

	
	
}
