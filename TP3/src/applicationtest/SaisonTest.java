package applicationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Saison;
import application.Episode;

public class SaisonTest extends Saison {

	@Test
	public void testGetNbEpisode(){
		Saison c = new Saison();
		c.addEpisode(new Episode(1, 1, "La Règle du jeu", 60));
		c.addEpisode(new Episode(1, 2, "Cerise", 60));
		assertEquals(c.getNbEpisodes(), 2);
	}
	
	@Test
	public void testGetDuree(){
		Saison c = new Saison();
		c.addEpisode(new Episode(1, 1, "La Règle du jeu", 60));
		c.addEpisode(new Episode(1, 2, "Cerise", 60));
		assertEquals(c.getDureeTotale(), 120);
	}
	
}

