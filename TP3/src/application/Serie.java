package application;

import java.util.ArrayList;

public class Serie {
	private int id;
	private String titre;
	private ArrayList<Saison> listeSaisons;

	public Serie(int id, String titre) {
		this.id = id;
		this.titre = titre;
		this.listeSaisons = new ArrayList<Saison>();
	}
	
	/**
	 * Ajouter une saion dans la liste
	 * @param s : objet Saison
	 */
	public void addSaison(Saison s) {
		this.listeSaisons.add(s);
	}

	public int getId() {return this.id;}

	public String getTitre() {return this.titre;}

	public int getDureeTotale() {
		int dureeTotale = 0;
		for (Saison s: listeSaisons) {
			dureeTotale = dureeTotale + s.getDureeTotale();
		}
		return dureeTotale;
	}
	public int getNbEpisodes() {
		int nbEpisode = 0;
		for (Saison s: listeSaisons) {
			nbEpisode = nbEpisode + s.getNbEpisodes();
		}
		return nbEpisode;
	}
	public int getNbSaison() {return listeSaisons.size();}

	public String toString() {
		String resultat = "";
		for (Saison s: listeSaisons) {
			resultat = resultat + s.toString()+ "\n";
		}
		return "id: "+id+"\nTitre: "+titre+"\nDuree"+this.getDureeTotale()+"\nNb Saisons: "+ this.getNbSaison()+"\nNb Episodes: "+this.getNbEpisodes()+"\nEpisode : \n"+resultat;
	}
}
