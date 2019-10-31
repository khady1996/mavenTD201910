package org.multimodules.service;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.multimodules.dao.IMedecinDao;
import org.multimodules.domaine.Medecin;

public class TestMedecinService {

	/**
	 * Test unitaire de la classe MedecinService
	 */
	@Test
	public void testLectureMedecin() {

		/*
		 * Sc�nario du test : La demande de lecture d'informations d'un m�decin � partir
		 * de son identifiant nous ram�ne la totalit� de ses caract�ristiques.
		 */

		// TODO 1. Mocker l'interface du DAO

		IMedecinDao dao = Mockito.mock(IMedecinDao.class);

		// 2. Cr�er le service

		MedecinService service = new MedecinService(dao);

		// 3a. Imposer un comportement au mock (stubbing)

		Mockito.when(dao.readMedecinbyId(1)).thenReturn(new Medecin(1, null, "OBERLE", "Fran�ois"));

		// 3.b Appeler une m�thode du service (r�sultat r�el)

		Medecin medecinRetour = service.lireMedecin(1);

		// 4. Comparer le r�sultat r�el avec le r�sultat attendu

		Assert.assertEquals(medecinRetour.getIdmed(), 1);
		Mockito.verify(dao).readMedecinbyId(1);
	}
}
