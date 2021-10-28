package application;

import java.util.ArrayList;

public class Collection {
	
	private ArrayList<Serie>listeSeries;

	public Collection() {
		this.listeSeries = new ArrayList<Serie>();
	}

	/**
	 * Ajouter une série dans la liste
	 * @param serie : objet serie qu'on ajoute
	 */
	public void addSerie(Serie serie) {
		this.listeSeries.add(serie);
	}

	public int getDureeTotale() {
		int dureeTotale = 0;
		for (Serie s: listeSeries) {
			dureeTotale = dureeTotale + s.getDureeTotale();
		}
		return dureeTotale;
	}

	public int getNbEpisodes() {
		int nbEpisode = 0;
		for (Serie s: listeSeries) {
			nbEpisode = nbEpisode + s.getNbEpisodes();
		}
		return nbEpisode;
	}

	public int getNbSeries() { return listeSeries.size();}

	public Serie getSerie(int id) {
		Serie serie = null;
		for (Serie s: listeSeries) {
			if(id == s.getId()) {
				serie =s;
			}
		}
		return serie;
	}

	/**
	 * recherche une série dans la liste en fonction du titre
	 * @param titre : titre de la serie à rechercher
	 */
	public Serie rechercheSerie(String titre) {
		Serie serieRecherche = null;
		for (Serie serie: listeSeries) {
			if(titre.equals(serie.getTitre())) {
				serieRecherche = serie;
			}
		}
		return serieRecherche;
	}

	/**
	 * Retourne le nombre de saison de la serie 
	 * 
	 */
	public int getNbSaison() {
		int nbSaisons = 0;
		for (Serie s: listeSeries) {
			nbSaisons = nbSaisons + s.getNbSaison();
		}
		return nbSaisons;
	}

	public void getSeries() {
		for (Serie s: listeSeries) {
			System.out.println(s.getId()+ " : " +s.getTitre());
		}
	}

	public String toString() {
		return "Nombre de series: "+this.getNbSeries()+"\nNombre de saisons: "+this.getNbSaison()+
				"\nNombre d'épisodes: "+this.getNbEpisodes()+ "\nDurée totale :"+ this.getDureeTotale();
	}
}
