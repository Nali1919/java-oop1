package org.lessons.java.shop;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		Random r = new Random();

		int codiceProdotto = r.nextInt(1000);
		

		Prodotto i = new Prodotto(codiceProdotto, "Pasta", "Bel prodotto", 20, 22);
		
		
		
		System.out.println("Nome Prodtto:  " + i.nomeEsteso());
		System.out.println("Il prezzo è:  " + i.prezzoSenzaIva());
		System.out.println("Prezzo con iva: " +i.prezzoConIva());
		
		System.out.println("eccolo" + i.padLeft());
		
	}
	
	
	
	
	
}
