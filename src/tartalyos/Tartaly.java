package tartalyos;

public class Tartaly extends Tarolo {

	private double nyomas;
	
	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}
	
	@Override
	public boolean veszelyesE() {
		if((getTerfogat()*nyomas) > 100)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", terfogat=" + getTerfogat()
				+ ", veszelyesE()=" + veszelyesE() + "]";
	}
	
	public boolean isBiggerThan(Tartaly tartaly) {
		if(this.nyomas > tartaly.nyomas ) 
			return true;
		else
			return false;
	}

	public static Tartaly getBiggerTartaly(Tartaly tartaly1, Tartaly tartaly2) {
		
		if(tartaly1.getTerfogat() > tartaly2.getTerfogat()) {
			return tartaly1;
		}
		
		return tartaly2;
	}
	
}
