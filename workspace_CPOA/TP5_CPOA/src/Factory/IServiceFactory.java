package Factory;

public interface IServiceFactory {
	IService creerService(String nom, String type);
}
