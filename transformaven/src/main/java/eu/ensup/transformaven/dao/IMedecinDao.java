package eu.ensup.transformaven.dao;

import eu.ensup.transformaven.domaine.Medecin;

public interface IMedecinDao {

	public String createMedecin(Medecin medecin);

	public Medecin readMedecinbyId(int index);

}
