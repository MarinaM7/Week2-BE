package esercizio3;

public class Banca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);

		System.out.println("Saldo conto: " + conto1.restituisciSaldo());

		try {
			conto1.preleva(1750.5);
			System.out.println("Saldo conto: " + conto1.restituisciSaldo());
		} catch (BancaException e) {
	
		}

		ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);

		conto2.stampaSaldo();

		try {
			conto2.preleva(2000);
			conto2.stampaSaldo();

		} catch (BancaException e) {
			
		}
	}
	

}
