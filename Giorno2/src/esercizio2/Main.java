package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {

		// TODO funzione accetta un intero N e crea un array di N numeri casuali(da 1 a
		// 100)
		// TODO scrivere lista di numeri e creare una seconda lista con la vecchia lista
		// + elementi di questa lista
		// TODO
		
		List<Integer> list = new ArrayList<Integer>();

		System.out.println("Inserisci il numero di elementi che vuoi creare: ");
		int num = in.nextInt();

		for (int i = 0; i < num; i++) {
			int random = (int) (Math.random() * 100);
			list.add(random);
		}

		System.out.println("Lista: " + list);

		Collections.sort(list);

		System.out.println("Lista in ordine crescente: " + list);
		
		listaNuova(list);

	}

	public static void listaNuova(List<Integer> list) {
		
		List<Integer> num2 = new ArrayList<Integer>();
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Crea una lista di interi da inserire all'interno della lista di prima \n NB. il num 0 blocca la richiesta");
		int numero = 0;
		
		do {
			System.out.println("Inserisci numero");
			numero = in.nextInt();
			if(numero != 0) {
				num2.add(numero);
			}
		}while(numero != 0);
		
		list.addAll(num2);
	
		System.out.println("Nuova lista: " + list);
		
		Collections.reverse(list);
		
		System.out.println("Lista in ordine contrario: " + list);
		
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println("Lista in ordine decrescente: " + list);
		
		bool(list);
		
	}
	
	public static void bool(List<Integer> list) {
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Lista: " + list);
		System.out.println("Seleziona: ");
		System.out.println("> 1 per stampare i numeri nelle posizioni dispari");
		System.out.println("> 2 per stampare i numeri nelle posizioni pari");
		int selezione = in.nextInt();
		
		if(selezione==1) {
			for(int i = 0; i<list.size(); i = i+2) {
				System.out.print(" " + list.get(i));
			}
		}else if(selezione == 2) {
			for(int i = 1; i<list.size(); i = i+2 ) {
				System.out.print(" " + list.get(i));
			}
		}else {
			System.out.println("ATTENZIONE! La selezione è sbagliata. Ritenta");
			bool(list);
		}
		
		
		in.close();
	}

}
