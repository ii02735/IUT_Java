package calcul;

import bridge.ICalcul;
import bridge.Maison;

public class CalculTaxe implements ICalcul{

	@Override
	public int getCout(Maison m) {
		// TODO Auto-generated method stub
		if(m.getSurface() < 80 && m.getValeurLocative() < 1000)
		{
			return 0;
		}
		else
			return m.getTaxe();
	}

}
