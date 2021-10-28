package application;

import java.util.Scanner;

public class Programme extends Collection {
	//private String fichierSauvegarde;

	public static void main(String args[])  
	{
		Collection maCollection = new Collection();
		
		// ------ Deuxième série
		Serie x = new Serie(87739, "Le Jeu de la dame");
		Saison s = new Saison();
		s.addEpisode(new Episode(1, 1, "Ouvertures", 60));
		s.addEpisode(new Episode(1, 2, "Échanges", 60));
		s.addEpisode(new Episode(1, 3, "Pions doublés", 60));
		s.addEpisode(new Episode(1, 4, "Milieu de jeu", 60));
		s.addEpisode(new Episode(1, 5, "Fourchette", 60));
		s.addEpisode(new Episode(1, 6, "Ajournement", 60));
		s.addEpisode(new Episode(1, 7, "Finale", 60));

		x.addSaison(s);
		maCollection.addSerie(x);

		// ------ Deuxième série
		x = new Serie(76479, "The Boys");
		s = new Saison();
		s.addEpisode(new Episode(1, 1, "La Règle du jeu", 60));
		s.addEpisode(new Episode(1, 2, "Cerise", 60));
		s.addEpisode(new Episode(1, 3, "Prends ça", 60));
		s.addEpisode(new Episode(1, 4, "La Fille", 60));
		s.addEpisode(new Episode(1, 5, "Des bleus à l'âme", 60));
		s.addEpisode(new Episode(1, 6, "Les Innocents", 60));
		s.addEpisode(new Episode(1, 7, "Question de survie", 60));
		s.addEpisode(new Episode(1, 8, "On ne prend plus de gants", 60));
		x.addSaison(s);

		s = new Saison();
		s.addEpisode(new Episode(1, 1, "Comme à la fête foraine", 60));
		s.addEpisode(new Episode(1, 2, "Préparation propre et planification", 60));
		s.addEpisode(new Episode(1, 3, "La Charge de la brigade légère", 60));
		s.addEpisode(new Episode(1, 4, "Rien de tel dans le monde entier", 60));
		s.addEpisode(new Episode(1, 5, "Quand faut y aller, faut y aller", 60));
		s.addEpisode(new Episode(1, 6, "On ne prend plus de gants", 60));
		s.addEpisode(new Episode(1, 7, "Le Fils du boulanger", 60));
		s.addEpisode(new Episode(1, 8, "Les Innocents", 60));
		x.addSaison(s);

		maCollection.addSerie(x);	
		while(true) {

			System.out.println("******************");
			System.out.println("* Ma Serietheque *");
			System.out.println("******************");
			System.out.println("s : Statistiques");
			System.out.println("l : Liste des séries");
			System.out.println("d : Détail d'une série");
			System.out.println("r : Rechercher une série");
			System.out.println("a : Ajouter une série");
			System.out.println("q : Quitter l'application");
			System.out.println("Choisir une option : ");


			Scanner sc = new Scanner(System.in);
			String r = sc.nextLine();

			switch(r){

			case "s": 
				System.out.println("Statistiques :");
				System.out.println(maCollection);
				break;

			case "l":
				System.out.println("Liste des séries :");
				maCollection.getSeries();
				break;

			case "d":
				System.out.println("Détail d'une série");
				System.out.println("Quel est l'ID de la série ?");
				int choixSerie = sc.nextInt();
				Serie maSerie = maCollection.getSerie(choixSerie);
				if (maSerie != null) {
					System.out.println(maSerie);
				}else {
					System.out.println("id n'existe pas");
				}
				break;

			case "r":
				System.out.println("Rechercher une série");
				System.out.println("Quel est le nom de votre série ?");
				String titre = sc.nextLine();
				Serie rechercheSerie = maCollection.rechercheSerie(titre);
				if (rechercheSerie != null) {
					System.out.println(rechercheSerie);
				}else {
					System.out.println("Série n'existe pas");
				}
				break;

			case "a":
				Scanner nomSerie = new Scanner(System.in);
				System.out.println("Ajouter une série");
				System.out.println("Quel est l'id de la serie ?");
				int idSerie = sc.nextInt();
				System.out.println("Quel est le titre de la serie ?");
				String titreSerie = nomSerie.nextLine();
				maCollection.addSerie(new Serie(idSerie, titreSerie));
				System.out.println("Serie ajoute :");
				break;

			case "q":
				System.out.println("Quitte l'application");
				System.exit(-1);
				break;

			default:
				System.out.println("Choix incorrect");
				break;
			}


		}
	}

//	public void sauvegarder(Collection pCollection) {
//
//	}
//
//	public Collection chargerSauvegarde() {
//
//	}
}
