package serveur;

import java.io.IOException;

public interface IServeurFactory {
	
	Serveur creerServeur(String nom) throws IOException;
}
