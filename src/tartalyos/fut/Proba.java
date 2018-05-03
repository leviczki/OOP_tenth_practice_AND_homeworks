package tartalyos.fut;
import tartalyos.Tartaly;

public class Proba {

	public static void main() {
		Tartaly[] tartalyArray = new Tartaly[5];
		
		for(int i = 0; i < tartalyArray.length; i++) {
			tartalyArray[i] = new Tartaly(i,i*2);
		}
		
		for(Tartaly tartaly : tartalyArray) {
			System.out.println(tartaly);
		}
		
		int maxNyomas = 0;
		
		for(int i = 1; i < tartalyArray.length; i++) {
			if(tartalyArray[i].isBiggerThan(tartalyArray[maxNyomas])) {
				maxNyomas = i;
			}
		}
		
		System.out.println("Legnagyobb: "+tartalyArray[maxNyomas].toString());
		
		int maxTerfogat = 0;
		
		for(int i = 1; i < tartalyArray.length; i++) {
			if(tartalyArray[i].getTerfogat() > tartalyArray[maxTerfogat].getTerfogat()) {
				maxTerfogat = i;
			}
		}
		
		System.out.println("Legnagyobb: "+tartalyArray[maxTerfogat].toString());
	}
	
}
