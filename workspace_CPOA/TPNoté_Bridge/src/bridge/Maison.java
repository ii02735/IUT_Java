package bridge;

public class Maison {
	
	private int surface;
	private int valeurLocative;
	private ICalcul calcul = null;
	
	public Maison(int surface, int valeurLocative) {
		this.valeurLocative = valeurLocative;
		this.surface = surface;
	}
	
	public void choisirCalcul(ICalcul calcul)
	{
		this.calcul = calcul;
	}
	
	public int getTaxe () {
		return valeurLocative * 2;
	}
	public int getValeurLocative() {
		return valeurLocative;
	}
	public int getSurface() {
		return surface;
	}
	
	public int getMontant()
	{
		return calcul.getCout(this);
	}
}
