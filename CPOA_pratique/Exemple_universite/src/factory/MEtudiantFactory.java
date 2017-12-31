package factory;

import structure.Etudiant;
import structure.M1Etudiant;
import structure.M2Etudiant;

public class MEtudiantFactory implements IEtudiantFactory{

	@Override
	public Etudiant buildEtudiant(String annee, String nom) {
		Etudiant etu = null;
		switch(annee) {
		case "M1":
			etu = new M1Etudiant(nom);
			break;
		case "M2":
			etu = new M2Etudiant(nom);
			break;
		default:
			etu = null;
		}
		return etu;
	}

}