package heavenpark.model;

public class Place {

	//Attributs
	private static int placecree = 0;
	private int idPlace;
	private boolean pris;
	private int etage;
	private int allee;
	private int idParking;
	private int idUser;

	//Constructeurs
	public Place(int etage, int allee, int idParking) {
		this.placecree ++;
		this.idPlace = placecree;
		this.etage = etage;
		this.allee = allee;
		this.idParking = idParking;
		this.pris = false;
		
	}

	public Place(int idPlace, boolean pris, int etage, int allee, int idParking) {
		this.idPlace = idPlace;
		this.pris = pris;
		this.etage = etage;
		this.allee = allee;
		this.idParking = idParking;
	}

	//Accesseurs
	public int getidPlace() {
		return idPlace;
	}
	public boolean isPris() {
		return pris;
	}

	public void setPris(boolean pris) {
		this.pris = pris;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public int getAllee() {
		return allee;
	}

	public void setAllee(int allee) {
		this.allee = allee;
	}
	public int getidParking() {
		return idParking;
	}
	public void setidParking(int id) {
		this.idParking=id;
	}

	//Methodes
	public void attribueA(Utilisateur unUtilisateur){
			this.idUser = unUtilisateur.getIdUser();
	}
}
