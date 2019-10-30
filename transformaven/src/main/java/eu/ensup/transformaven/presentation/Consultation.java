package eu.ensup.transformaven.presentation;

import eu.ensup.transformaven.domaine.Medecin;
import eu.ensup.transformaven.domaine.Patient;
import eu.ensup.transformaven.service.MedecinService;

public class Consultation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medecin medecin = new Medecin(1, null, "OBERLE", "Fran�ois");
		Patient patient = new Patient(1, medecin, "NDIAYE", "Khady");
		medecin.setP(patient);

		MedecinService medserv = new MedecinService();

		System.out.println(medserv.consulterPatient());

		// medserv.creerMedecin(medecin);
		// stem.out.println(medserv.LireMedecin(1));

	}

}
