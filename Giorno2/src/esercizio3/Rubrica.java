package esercizio3;

import java.util.HashMap;
import java.util.Map;

public class Rubrica {

	HashMap<String, String> rubrica = new HashMap<>();
	
	public HashMap<String, String> insert(String nome, String nTel) {
		rubrica.put(nome, nTel);
		return rubrica;
	}

	public HashMap<String, String> canc(String nome) {
		rubrica.remove(nome);
		return rubrica;
	}
	
	public String getNumber(String nome){
		return rubrica.get(nome);
	}
	
	public String getName(String nTel){
		return rubrica.get(nTel);
	}

	public void print() {
		System.out.println("HashMap elements: ");
		for (Map.Entry mEntry : rubrica.entrySet()) {
			System.out.print("key: " + mEntry.getKey() + " & Value: ");
			System.out.println(mEntry.getValue());
		}
	}

}
