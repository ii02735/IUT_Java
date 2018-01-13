package bibliotheque;

import java.util.Timer;
import java.util.TimerTask;

public class Abonne {
	
	private int numero;
	private boolean estBanni;
	private Timer tempsBanni;
	public Abonne(int numero)
	{
		this.estBanni = false;
		this.numero = numero;
		this.tempsBanni = new Timer();
	}
	
	public void setEstBanni(boolean b)
	{
		this.estBanni = b;
		if(b)
		{
			tempsBanni.schedule(new TimerTask() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Abonne.this.estBanni = false;
					System.out.println("temps écoulé");
				}
			},10000);
		}
		
	}
	
	public boolean getEstBanni()
	{
		return this.estBanni;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
}
