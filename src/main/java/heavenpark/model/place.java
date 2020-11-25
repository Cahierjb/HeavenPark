package heavenpark.model;

public class place {
	
	private boolean pris;
	private parking parking;
	
	public place(parking parc) {
		this.parking=parc;
		this.pris=false;
		
	}
	
	
	public parking getParking() {
		return this.parking;
	}
	public boolean getPris() {
		return this.pris;
	}
	
	public void setParking(parking p) {
		this.parking=p;
	}
	public  void setPris(boolean pris) {
		this.pris=pris;
	}
}
