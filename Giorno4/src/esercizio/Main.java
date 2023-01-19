package esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Prodotti> prod = new ArrayList<Prodotti>() {{
				add(new Prodotti(011, "scarpe", Categoria.BOYS, 75));
				add(new Prodotti(702, "Il cavaliere insesitente", Categoria.BOOKS, 9.8));
				add(new Prodotti(603, "pannolini", Categoria.BABY, 41.5));
				add(new Prodotti(304, "carrozina", Categoria.BABY, 180.5));
				add(new Prodotti(032, "maglia", Categoria.BOYS, 90.8));
				add(new Prodotti(022, "Iliade", Categoria.BOOKS, 58));
				add(new Prodotti(044, "biberon", Categoria.BABY, 36.5));
				add(new Prodotti(045, "Ars amatoria", Categoria.BOOKS, 300.5));
				add(new Prodotti(074, "Odissea", Categoria.BOOKS, 103));
				add(new Prodotti(034, "ciuccio", Categoria.BABY, 9.9));
				add(new Prodotti(056, "pantaloni", Categoria.BOYS, 39.5));
		}};
		
		System.out.println("\n ------------------------- ESERCIZIO 1 ( price > 100 ) ------------------------- \n");
		Stream<Prodotti> books = prod.stream().filter((p) -> p.categoria == Categoria.BOOKS && p.prezzo > 100);
		books.forEach(p -> System.out.println(p));
		
		System.out.println("\n ------------------------- ESERCIZIO 2 ( print ) ------------------------- \n");
		Stream<Prodotti> baby = prod.stream().filter((p) -> p.categoria == Categoria.BABY);
		baby.forEach(p -> System.out.println(p));
	
		System.out.println("\n ------------------------- ESERCIZIO 3 ( 10% dicount ) ------------------------- \n");
		Stream<Prodotti> boys = prod.stream().filter((p) -> p.categoria == Categoria.BOYS);
		boys.forEach(p -> System.out.println(p + " --> with 10% discount: " + p.sconto()));
	

		Costumer c1 = new Costumer(334, "Mario", 2);
		Costumer c2 = new Costumer(564, "Paolo", 1);
		Costumer c3 = new Costumer(066, "Claudia", 2);
		Costumer c4 = new Costumer(066, "Franco", 2);
		Costumer c5 = new Costumer(066, "Tony", 3);
		
		Order o1 = new Order(445, "completed", LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 8), prod.subList(3, 5), c1);
		Order o2 = new Order(840, "completed", LocalDate.of(2021, 5, 19), LocalDate.of(2021, 9, 12), prod.subList(1, 3), c2);
		Order o3 = new Order(993, "not completed", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 21), prod.subList(8, 11), c3);
		Order o4 = new Order(673, "not completed", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 21), prod.subList(5, 7), c4);
		Order o5 = new Order(793, "completed", LocalDate.of(2021, 2, 15), LocalDate.of(2021, 2, 21), prod.subList(5, 7), c5);
		
		List<Order> orders = new ArrayList<Order>() {{
			add(o1);
			add(o2);
			add(o3);
			add(o4);
			add(o5);
		}};

		System.out.println("\n ------------------------- ESERCIZIO 4 ( orders of costumers tier 2 ) ------------------------- \n");
		Stream<Order> ordersCostumer = orders.stream().filter(o -> o.costumer.tier == 2);
		ordersCostumer.forEach(o -> System.out.println(o + "\n"));
		
	}
}

class Prodotti {
	public long id;
	public String nome;
	public Enum<Categoria> categoria;
	public double prezzo;
	
	public Prodotti(long id, String nome, Categoria categoria, double prezzo) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.prezzo = prezzo;
	}
	
	public double sconto() {
		return prezzo - (prezzo*10)/100;
	}
	
	@Override
	public String toString() {
		return "Category: " + categoria + " || Product name: " + nome + " || Price: " + prezzo;
	}
	
}

class Order{
	public long id;
	public String status;
	public LocalDate orderDate;
	public LocalDate deliveryDate;
	public List<Prodotti> products;
	public Costumer costumer;
	
	public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Prodotti> products,
			Costumer costumer) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.costumer = costumer;
	}
	
	@Override
	public String toString() {
		return "Order num: " + id + " - Ordered by: " + costumer.name + " - Tier: " + costumer.tier + " - Status: " + status + "\n --> Products: " + products;
	}
	
}

class Costumer{
	public long id;
	public String name;
	public int tier;
	
	public Costumer(long id, String name, int tier) {
		super();
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
}

