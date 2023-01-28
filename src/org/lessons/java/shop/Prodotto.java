package org.lessons.java.shop;

public class Prodotto {
	
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	
	

	public Prodotto(int codice, String nome, String descrizione, int prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	
	String nomeEsteso() {
		
		return  codice + nome;
		
	}
	
     double prezzoSenzaIva() {
		
	  return prezzo;
	}
	
	double prezzoConIva () {
		
		return prezzo + iva;
	}
	
	String padLeft () {
		
		int intValue = 125;
		 
        String s = String.format("%011d", intValue);
        
        return s;
	}
	
	

}
