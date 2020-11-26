package heavenpark.model;


public class Parking {

	//Attributs
	private int idParking;
	private String nom;

	private int nbEtage;

	private int nbAllee;

	private int placeMax;
	private int placeUtilise;

	private Place[][] mapParking;

	//Constructeur
	/*public Parking(String nom, int nbEtage, int nbAllee, int nbPlacemax) {
		this.nom=nom;
		this.nbEtage=nbEtage;
		this.nbAllee=nbAllee;
		this.placeMax =nbPlacemax;
		this.placeUtilise = 0;


		
	}*/ 

	public Parking(String nom, int nbEtage, int nbAllee,  int placeMax) {
		this.nom = nom;
		this.nbEtage = nbEtage;
		this.nbAllee = nbAllee;
		this.placeMax = placeMax;
		this.placeUtilise = placeUtilise;

		mapParking = new Place[nbEtage][nbAllee];
	}

	public Parking(int idParking, String nom, int nbEtage, int nbAllee,  int placeMax, int placeUtilise) {
		this.idParking = idParking;
		this.nom = nom;
		this.nbEtage = nbEtage;
		this.nbAllee = nbAllee;
		this.placeMax = placeMax;
		this.placeUtilise = placeUtilise;

		mapParking = new Place[nbEtage][nbAllee];;
	}


	//get
	public String getNom() {
		return nom;
	}
	public int getEtage() {
		return nbEtage;
	}
	public int getnbAllee() {
		return nbAllee;
	}
	public int GetPlaceMax() {
		return placeMax;
	}
	public int GetPlaceUtilise() {
		return placeMax;
	}
	
	//set
	public void SetNom(String name) {
		this.nom=name;
	}
	public void setEtage(int nbEtage) {
		this.nbEtage=nbEtage;
	}
	public void setAllee(int nbAllee) {
		this.nbAllee=nbAllee;
	}
	public void SetplaceMax(int placeMax) {
		this.placeMax=placeMax;
	}
	public void SetPlaceUtilise(int placeUtil) {
		this.placeUtilise=placeUtil;
	}
}
