package esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		// TODO use Set and HashSet
		
		Set<String> lista = new HashSet<>();
		ArrayList <String> duplicati = new ArrayList<>();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Seleziona il numero di elementi(parole) che vuoi inserire:");
		int n = 0;
		
		try {
			n = in.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Devi scrivere un numero intero.");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println("Scrivi la parola " + (i+1) + " e premi invio:");
			String parola = in.next();
			if(lista.contains(parola)) {
				duplicati.add(parola);
				System.out.println("ATTENZIONE! Questa parola è doppia: " + parola + "; e non verrà inserita nel Set.");
			}
			lista.add(parola);
		}
		
		if(!duplicati.isEmpty()) {
			System.out.println();
			System.out.println("---LISTA DUPLICATI---");
			System.out.println("Lista delle parole duplicate " + duplicati);
		}
		
		
	    System.out.println();
	    System.out.println("---HASHSET---");
		System.out.println("Hashset " + lista + " ha size: " + lista.size());
		
		System.out.println();
		System.out.println("---HASHSET ITERATO---");
		Iterator<String> it = lista.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	    
	
		
		in.close();

	}

}
