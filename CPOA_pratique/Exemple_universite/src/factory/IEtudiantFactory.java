package factory;

import structure.Etudiant;

public interface IEtudiantFactory {
	Etudiant buildEtudiant(String annee,String nom);
}
