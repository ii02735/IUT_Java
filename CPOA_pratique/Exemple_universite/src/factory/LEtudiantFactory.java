package factory;

import structure.*;

public class LEtudiantFactory implements IEtudiantFactory{

	@Override
	public Etudiant buildEtudiant(String annee, String nom) {
		// TODO Auto-generated method stub
		Etudiant etu = null;
		switch(annee) {
		case "L1":
			etu = new L1Etudiant(nom);
			break;
		case "L2":
			etu = new L2Etudiant(nom);
			break;
		default:
			etu = null;
		}
		
		return etu;
		
	}

}
