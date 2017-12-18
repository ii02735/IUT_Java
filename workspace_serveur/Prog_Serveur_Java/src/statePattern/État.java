package statePattern;

import biblioth�que.Abonne;
import biblioth�que.Biblioth�que;
import biblioth�que.Document;

public abstract class �tat {
	
	public boolean identifier(Abonne a) {
		boolean r�sultat = false;
		for(Abonne identifier : Biblioth�que.abonn�s)
		{
			if(a.getNum�ro() == identifier.getNum�ro())
			{
				r�sultat = true;
				break;
			}
				
		}
		return r�sultat;
	}
	boolean identificationDocument(Document d)
	{
		boolean r�sultat = false;
		for(Document identifier:Biblioth�que.documents)
		{
			if(identifier.numero() == d.numero())
			{
				r�sultat = true;
				break;
			}
		}
		return r�sultat;
	}
	public abstract �tat emprunt(Abonne a,Document d);
	public abstract �tat r�server(Abonne a,Document d);
	public abstract �tat retour(Document l);
}
