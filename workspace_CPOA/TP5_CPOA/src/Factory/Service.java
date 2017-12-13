package Factory;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public abstract class Service implements IService {
	private String nom = null;
	
	public Service () {		
	}
	public Service (String nom) {
		this();
		this.nom = nom;
	}
	/* (non-Javadoc)
	 * @see Factory.IService#getType()
	 */
	@Override
	public abstract String getType();
	/* (non-Javadoc)
	 * @see Factory.IService#getNom()
	 */
	@Override
	public String getNom(){
		return this.nom;
	}
	/* (non-Javadoc)
	 * @see Factory.IService#setNom(java.lang.String)
	 */
	@Override
	public void setNom(String nom){
		this.nom = nom ;
	}
	
	public abstract IService spawn();
}
