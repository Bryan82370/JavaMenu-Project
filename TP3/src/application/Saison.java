package application;

import java.util.ArrayList;

public class Saison {
	private ArrayList<Episode> listeEpisodes;

	public Saison() {
		this.listeEpisodes = new ArrayList<Episode>();
	}

	/**
	 * Ajouter un episode dans la liste
	 * @param e : objet episode
	 */
	public void addEpisode(Episode e) {
		this.listeEpisodes.add(e);
	}

	public int getDureeTotale() {
		int dureeTotale = 0;
		for (Episode e: listeEpisodes) {
			dureeTotale = dureeTotale + e.getDuree();
		}
		return dureeTotale;
	}
	public int getNbEpisodes() {return listeEpisodes.size();}

	public String toString() {
		String resultat = "";
		for (Episode e: listeEpisodes) {
			resultat = resultat + e.toString()+ "\n";
		}
		return resultat;
	}
}
