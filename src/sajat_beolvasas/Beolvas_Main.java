package sajat_beolvasas;

import java.util.Scanner;
import java.util.InputMismatchException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		
		try {
			tomb = getUserInputFromBufferedReader(tomb.length);
		} catch (IntegerNotPrimeException e) {
			e.printStackTrace();
		} finally { tomb_ki(tomb); }
		
		//-------------------------------------------
		//-------------------------------------------
		//-------------------------------------------
		//-------------------------------------------
		//-------------------------------------------
		
	}
	
	public static void tomb_ki(int tomb[]) {
		System.out.print("Array: ");
		
		for(int x : tomb) {
			System.out.print(x+" ");
		}
		
		System.out.println();
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
	
	public static int[] getUserInputFromBufferedReader(int numberOfElements) throws IntegerNotPrimeException {
		
		int[] intArray = new int[numberOfElements];
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nInteger.valueOf(input.readLine()).intValue()\tCSAK PRIMET!");
		
		for (int i = 0; i < intArray.length; i++) {
			
			boolean wrongInput = true;
			
			//BufferedReader kivetel kezeles
			try {
				
				//Beolvasasi hiba kivetel kezeles
				do {
				
					try {
						System.out.print("\t"+(i+1)+". tomb elem: ");
						intArray[i] = Integer.valueOf(input.readLine()).intValue();
					
						if(!isPrime(intArray[i]))
							throw new IntegerNotPrimeException();
					
						wrongInput = false;
					
					} catch (IntegerNotPrimeException e) {
					
						System.out.println(e.getMessage());
					}
				
				} while(wrongInput);
				
				
			} catch (IOException ioKivetel) {
				ioKivetel.printStackTrace();
			}
		}
		
		return intArray;
	}
}
