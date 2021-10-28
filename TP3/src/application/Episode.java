package application;

public class Episode {
	public int numero;
	public int numeroSaison;
	public int duree;
	public String titre;

	
	public Episode(int idSaison,int id,String titre,int duree){
		this.numeroSaison=idSaison;
		this.numero=id;
		this.titre=titre;
		this.duree=duree;
	}
	
	public int getDuree() {return this.duree;}

	public String toString() {
		return "S"+numeroSaison+"E"+numero+ " : " + titre; 
	}
}
