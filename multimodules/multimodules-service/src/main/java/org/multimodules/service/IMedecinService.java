package org.multimodules.service;

import org.multimodules.domaine.Medecin;

public interface IMedecinService {

	public Boolean consulterPatient();

	public String creerMedecin(Medecin medecin);

	public Medecin lireMedecin(int index);

}
