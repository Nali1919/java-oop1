package jana60.bank;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome;
		int numeroConto = 0;
		String sceltaUtente = "";
		double money;

		Scanner s = new Scanner(System.in);
		System.out.println("Dimmi il tuo nome:");
		nome = s.nextLine();

		Random r = new Random();
		numeroConto = r.nextInt(1000);

		Conto c = new Conto(nome, numeroConto);

		System.out.println("Nome Acount: " + nome);
		System.out.println("Numero Acount: " + numeroConto);
		System.out.println("Saldo: " + c.saldo);

		while (!sceltaUtente.equals("chiudere")) {
			System.out.println("Vuoi depositare, prelevare o chiudere?");
			sceltaUtente = s.nextLine();

			if (sceltaUtente.equals("depositare")) {
				System.out.println("Quanto depositi?");
				money = s.nextDouble();
				s.nextLine();
				c.deposita(money);
				System.out.println("Saldo: " + c.saldo);
			} else if (sceltaUtente.equals("prelevare")) {
				System.out.println("Quanto prelevi?");
				money = s.nextDouble();
				s.nextLine();
				if (money > c.saldo) {
					System.out.println("Ops non hai soldi!");
					System.out.println("Saldo: " + c.saldo);
				} else {
					c.preleva(money);
					System.out.println("Saldo: " + c.saldo);
				}
			}
		}

		if (sceltaUtente.equals("chiudere")) {
			System.out.println("Ciao!");
		}

		s.close();
		
	}

}
