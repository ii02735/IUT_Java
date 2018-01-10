package appli;
import java.util.Date;

public class Commande {
	
	private int numero;
	private Date dateLiv = null;
	private �tat �tats;
	
	public Commande(int numero, �tat e)
	{
		this.numero = numero;
		this.�tats = e;
	}
	
	public int getNum�ro()
	{
		return this.numero;
	}
	
	public void livrer() throws Exception
	{
		this.�tats.livrer(this);
	}
	
	public void payer() throws Exception
	{
		this.�tats.payer(this);
	}
	
	public void rembourser() throws Exception
	{
		this.�tats.rembourser(this);
	}
	
	public void set�tat(�tat e)
	{
		this.�tats = e;
	}
	
	public �tat get�tat()
	{
		return this.�tats;
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
