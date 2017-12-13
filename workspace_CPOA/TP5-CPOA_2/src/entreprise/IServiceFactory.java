package entreprise;


public interface IServiceFactory extends Iterable<IService>{
	IService create(String type, String nom) throws ServiceExistantException;
}
