package factoriel;

import java.util.Scanner;

public class factoriell {
	
	public static int factoriel(int input) {
		int factoriel = 1;
		for (int i = 1;i<(input+1);i++) {
			factoriel *= i;
		}
		return factoriel;
	}
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir Sayý giriniz: ");
		
		int sayi = input.nextInt();
		
		int factoriel = factoriel(sayi);
		
		System.out.println(factoriel);
		
		
		
	}

}
