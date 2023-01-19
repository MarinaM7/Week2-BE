package esercizio2;

import java.util.ArrayList;
import java.util.List;

public class Main extends Thread {
	
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		creaArrays();
		
	}
	
	public static void creaArrays()  {
		
		for (int i = 0; i < 3000; i++) {
			int random = (int) (Math.random() * 100);
			list.add(random);
		}
		
		List<Integer> one = list.subList(0, 1000);
		List<Integer> two = list.subList(1000, 2000);
		List<Integer> three = list.subList(2000, 3000);
		
		int x = Sum(one);
		int y = Sum(two);
		int z = Sum(three);
		
		System.out.println(x+y+z);
			
	}	
	
	public static int Sum(List<Integer> nums) {
		
		int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        
        return sum;
        
	}
	
	@Override
	public void run() {
		
		
	}
}

/*

	Scrivere un programma multithread in Java che dato un array di 3000 valori numerici generati casualmente
	ne esegue la somma in modo parallelo.
	Creare 3 thread e assegnare ad ogni thread una partizione dell’array (1000 valori).
	Ogni thread esegue la somma dei propri valori e mettere il risultato in una struttura dati del thread main contenente i risultati parziali.
	Il thread main deve sincronizzarsi sulla terminazione (join) dei thread figli dopodiché somma i risultati parziali e li stampa su console.

*/
