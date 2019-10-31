package org.multimodules.dao;

import org.multimodules.domaine.Medecin;

public interface IMedecinDao {

	public String createMedecin(Medecin medecin);

	public Medecin readMedecinbyId(int index);

}
