package sajat_beolvasas;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Beolvas_Main {
	
	public static void main(String[] args) {
		
		int tomb[] = new int[2];
		
		//-------------------------------------------
		
		try {
			tomb = getUserInput(tomb.length);
		} finally { tomb_ki(tomb); }
		
		
		//-------------------------------------------
		
		try {
			//tomb = getUserInput(tomb.length);
			tomb = getUserInputPrime(tomb.length);
		} catch (IntegerNotPrimeException e) {
			e.printStackTrace();
			
			for(int i = 0; i < tomb.length; i++) //ha valahol el lett rontva a bevitel, kinullázza az egész tömbot
				tomb[i] = 0;
			
		} finally { tomb_ki(tomb); }
		
		//-------------------------------------------
		
	}
	
	public static void tomb_ki(int tomb[]) {
		System.out.println("Array: ");
		
		for(int x : tomb) {
			System.out.println(x+" ");
		}
		
		System.out.println("\n");
	}
	
	public static int[] getUserInput(int numberOfElements) throws InputMismatchException {
		int[] intArray = new int[numberOfElements];
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("\ninput.nextInt()");
		
		for(int i = 0; i < intArray.length; i++) {
		
			System.out.print("\t"+(i+1)+". tomb elem: ");
			int tempInt = input.nextInt();
			//int tempInt = Integer.parseInt(input.nextLine());
			
			
			if(tempInt <= 0) {
				throw new InputMismatchException("Nagyobbnak kell lennie, mint 0!");
				
			}	else	{
				intArray[i] = tempInt;
			}
		}
		
		return intArray;
		
	}
	
	public static int[] getUserInputPrime(int numberOfElements) throws IntegerNotPrimeException {
		int[] intArray = new int[numberOfElements];
		Scanner input = new Scanner(System.in);
		System.out.println("\ninput.nextInt()\tCSAK PRIMET!");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print("\t"+(i+1)+". tomb elem: ");
			int tempInt = input.nextInt();
			//int tempInt = Integer.parseInt(input.nextLine());
			
			if(!isPrime(tempInt)) {
				throw new IntegerNotPrimeException();
			} else {
				intArray[i] = tempInt;
			}
			
		}
		
		return intArray;
	}
	
	private static boolean isPrime(int num) {
		
		if(num < 2) return false;
		if(num == 2) return  true;
		if((num % 2) == 0) return false;
		
		for(int i = 3; i*i <= num; i+= 2)
			if(num%i == 0) return false;
		
		return true;
	}
	
	
}
