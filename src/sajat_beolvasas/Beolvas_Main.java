package sajat_beolvasas;
import java.util.*;
public class Beolvas_Main {
	public static void main(String[] args) {
		/*int tomb[] = new int[5];
		
		try {
			tomb = getUserInput(5);
		} catch (IntegerNotPrimeException e) {
			//e.printStackTrace();
			
			for(int i = 0; i < tomb.length; i++) { //ha valahol el lett rontva a bevitel, kinullázza az egész tömbot
				if(tomb[i] != null) {
					tomb[i] = 0;
				}
			}
			
		}
		
		/*java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("input.nextInt()");
		for(int i = 0; i < tomb.length; i++) {
			System.out.print((i+1)+". tomb elem: ");
			tomb[i] = input.nextInt();
			
			if(tomb[i] <= 0)
				i--;
		}
		
		tomb_ki(tomb);
		
		System.out.println("input.nextLine()");
		for(int i = 0; i < tomb.length; i++) {
			System.out.print((i+1)+". tomb elem: ");
			tomb[i] = Integer.parseInt(input.nextLine());
			
			if(tomb[i] <= 0)
				i--;
		}
		
		input.close();*/
	}
	
	public static void tomb_ki(int tomb[]) {
		for(int x : tomb) {
			System.out.println(x+"\n");
		}
	}
	
	/*public static int[] getUserInput(int numberOfElements) throws InputMismatchException {
		int[] intArray = new int[numberOfElements];
		Scanner scanner = new Scanner(System.in);
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("input.nextInt()");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print((i+1)+". tomb elem: ");
			int tempInt = input.nextInt();
			
			if(tempInt <= 0) {
				//throw
			}	else	{
				intArray[i] = tempInt;
			}
		}
		
	}
	
	public static int[] getUserInputPrime(int numberOfElements) throws IntegerNotPrimeException {
		
	}*/
	
	
}
