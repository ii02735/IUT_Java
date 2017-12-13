package Factory;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class ServTechnique extends Service {
	public ServTechnique (String nom) {
		super(nom);		
	}	
	
	@Override
	public String getType() {	
		return "Technique";
	}

	@Override
	public IService spawn() {
		// TODO Auto-generated method stub
		return new ServTechnique(nom);
	}
}
