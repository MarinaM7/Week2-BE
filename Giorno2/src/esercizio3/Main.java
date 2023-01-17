package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	static HashMap<String, String> rubrica = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insert("Mario", "32352325234");
		insert("Gianni", "786351221736");
		insert("Paolo", "62132424517");
		insert("Anna", "89263163861");
		
		print();
		
		remove("Mario");
		
		System.out.println();
		print();
		
		System.out.println();
		getNumber("Paolo");
		getName("786351221736");
		
	}
	
	public static HashMap<String, String> insert(String nome, String nTel) {
		rubrica.put(nome, nTel);
		return rubrica;
	}

	public static HashMap<String, String> remove(String nome) {
		rubrica.remove(nome);
		return rubrica;
	}
	
	public static void getNumber(String nome){
		System.out.println("Il numero di " + nome + " è: " + rubrica.get(nome)); 
	}
	
	public static void getName(String nTel){
		for (Map.Entry mEntry : rubrica.entrySet()) {
            if (mEntry.getValue().equals(nTel)) {
                System.out.println("Il nome del num. " + nTel + " è: " + mEntry.getKey());
            }
		}
		
	}

	public static void print() {
		System.out.println("Rubrica: ");
		for (Map.Entry mEntry : rubrica.entrySet()) {
			System.out.print("Nome: " + mEntry.getKey() + " & Numero: ");
			System.out.println(mEntry.getValue());
		}
	}

}
