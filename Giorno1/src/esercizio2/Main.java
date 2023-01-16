package esercizio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci i km percorsi: ");
		int km = in.nextInt();
		
		System.out.println("Inserisci i litri di carburante utlizzati: ");
		
		try {
			int litri = in.nextInt();
			int risultato = km/litri;
			System.out.println("i km/litro percorsi sono: " + risultato);
			
		}catch(ArithmeticException e) {
			System.out.println("Non fare il furbo!");
		}finally {
			in.close();
		}
		
	}

}
