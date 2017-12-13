package Factory;

import java.util.List;
import java.util.ArrayList;
import java.util.Enumeration;

public class ServiceFactory implements IServiceFactory {
	
	private static List<IService> sortes = new ArrayList<>();
	
	@Override
	public IServiceFactory creerService(String nom, String type) throws IllegalArgumentException{
		Service s = null;
		if(type=="Technique")
			s = new ServTechnique(nom);
		else if(type=="Administratif")
			s = ServAdministratif.getInstance(nom);
		else
			throw new IllegalArgumentException();
		return s;
	}

	
	public static final void enumerateTypes()
	{
		
	}
	

}
