package applicationtest;

import static org.junit.Assert.*;

import org.junit.Test;

import application.Episode;

public class EpisodeTest extends Episode {

	@Test
	public void getDureeEpisode() {
		Episode z = new Episode(1, 1, "La Règle du jeu", 60); 
		assertEquals(z.getDuree(),60);
	}

}
