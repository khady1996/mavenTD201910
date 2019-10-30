package eu.ensup.transformaven.service;

import eu.ensup.transformaven.domaine.Medecin;

public interface IMedecinService {

	public Boolean consulterPatient();

	public String creerMedecin(Medecin medecin);

	public Medecin lireMedecin(int index);

}
