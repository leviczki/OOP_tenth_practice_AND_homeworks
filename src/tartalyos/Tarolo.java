package tartalyos;

public abstract class Tarolo {

	private int terfogat;
	
	public Tarolo(int terfogat) {
		this.terfogat = terfogat;
	}
	
	public abstract boolean veszelyesE();

	public int getTerfogat() {
		return terfogat;
	}
}
