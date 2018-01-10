package appli;
import java.util.Date;

public class Commande {
	
	private int numero;
	private Date dateLiv = null;
	private …tat Ètats;
	
	public Commande(int numero, …tat e)
	{
		this.numero = numero;
		this.Ètats = e;
	}
	
	public int getNumÈro()
	{
		return this.numero;
	}
	
	public void livrer() throws Exception
	{
		this.Ètats.livrer(this);
	}
	
	public void payer() throws Exception
	{
		this.Ètats.payer(this);
	}
	
	public void rembourser() throws Exception
	{
		this.Ètats.rembourser(this);
	}
	
	public void set…tat(…tat e)
	{
		this.Ètats = e;
	}
	
	public …tat get…tat()
	{
		return this.Ètats;
	}
	
	public void setDate(Date dateLiv)
	{
		this.dateLiv = dateLiv;
	}
	
	public Date getDate()
	{
		return this.dateLiv;
	}
}
