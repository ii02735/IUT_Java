package services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entreprise.IService;
import entreprise.IServiceFactory;
import entreprise.ServiceExistantException;

public class ServiceFactory implements IServiceFactory {
	private static List<IService> sortes = new ArrayList<>();
	static {
		sortes.add(ServAdministratif.getInstance());
		sortes.add(new ServTechnique("Technique"));
	}

	@Override
	public IService create(String type, String nom) throws ServiceExistantException {
		for (IService s : this) {
			if (s.getType().equals(type))
				return s.spawn(nom);
				
		}
		throw new IllegalArgumentException ("type");
	}

	@Override
	public Iterator<IService> iterator() {
		return sortes.iterator();
	}

}
