package heavenpark.model;

import java.awt.*;
public class parking {
	
	private String nom;
	private int nbEtage;
	private int nbAllee;
	private  int placeMax;
	private int placeUtilise;
	
	public parking(String nom, int nbEtage, int nbAllee, int nbPlacemax,int nbPlaceUtilise) {
		this.placeUtilise=nbPlaceUtilise;
		this.placeMax =nbPlacemax;
		this.nom=nom;
		this.nbEtage=nbEtage;
		this.nbAllee=nbAllee;
		
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
