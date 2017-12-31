package biblioth�que;

import java.util.ArrayList;
import java.util.List;

public class Abonne {
	
	private int num�ro;
	private List<Document> r�serv�s;
	private List<Document> emprunts;
	public Abonne(int num�ro)
	{
		this.r�serv�s = new ArrayList<>();
		this.emprunts = new ArrayList<>();
		this.num�ro = num�ro;
	}
	
	public int getNum�ro()
	{
		return this.num�ro;
	}
	
	public void ajouterEmprunt(Document d)
	{
		this.emprunts.add(d);
	}
	
	public void enleverEmprunt(Document d)
	{
		this.emprunts.remove(d);
	}
	
	public void r�serv�s(Document d)
	{
		this.r�serv�s.add(d);
	}
	
	public void enleverR�serv�(Document d)
	{
		this.r�serv�s.remove(d);
	}
	
}
