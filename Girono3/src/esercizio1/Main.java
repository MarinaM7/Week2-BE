package esercizio1;

import java.util.ArrayList;

public class Main extends Thread {

	char c;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main uno = new Main('*');
		Main due = new Main('#');
		
		uno.start();
		due.start();
		
	}
	
	public Main(char c) {
		this.c = c;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i<= 10;i++) {
			System.out.print(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

/*
Esercizio #1

Creare un’applicazione con due thread figli.
Ciascuno dei due thread ha associato un simbolo (ad es. * o #).
Fare in modo che ciascun thread stampi su console il proprio simbolo per 10 volte,
attendendo 1 secondo tra una stampa e l'altra.
*/