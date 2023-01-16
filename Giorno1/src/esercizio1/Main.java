package esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[5];

		for (int i = 0; i < 5; i++) {
			int random = (int) (Math.random() * 10);
			array[i] = random;
		}

		System.out.println(Arrays.toString(array));
		Scanner in = new Scanner(System.in);

		int num;

		do {
			System.out.println("Inserisci il numero che vuoi inserire (0 chiude esecuzione):");
			num = in.nextInt();
			if (num != 0) {
				System.out.println("Inserisci la posizione dove lo vuoi inserire(1-5):");
				try {
					int pos = in.nextInt();
					array[pos - 1] = num;
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("ERRORE - il valore inserito deve essere compreso tra 1 e 5. Riprova!");
				}
				System.out.println(Arrays.toString(array));
			} else {
				System.out.println("Il numero 0 blocca l'esecuzione");
			}

		} while (num != 0);

		in.close();

	}

}
