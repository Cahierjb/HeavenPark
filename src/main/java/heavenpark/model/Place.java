package heavenpark.model;

public class Place {

	//Attributs
	private int idPlace;
	private boolean pris;
	private char etage;
	private int allee;
	private int idParking;
	private int idUser;

	//Constructeurs
	public Place(char etage, int allee, int idParking) {
		this.etage = etage;
		this.allee = allee;
		this.idParking = idParking;
		this.pris = false;
		
	}

	public Place(int idPlace, boolean pris, char etage, int allee, int idParking) {
		this.idPlace = idPlace;
		this.pris = pris;
		this.etage = etage;
		this.allee = allee;
		this.idParking = idParking;
	}

	//Accesseurs
	public boolean isPris() {
		return pris;
	}

	public void setPris(boolean pris) {
		this.pris = pris;
	}

	public char getEtage() {
		return etage;
	}

	public void setEtage(char etage) {
		this.etage = etage;
	}

	public int getAllee() {
		return allee;
	}

	public void setAllee(int allee) {
		this.allee = allee;
	}

	//Methodes
	public void attribueA(Utilisateur unUtilisateur){
			this.idUser = unUtilisateur.getIdUser();
	}
}
