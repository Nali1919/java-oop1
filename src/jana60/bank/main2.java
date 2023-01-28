package jana60.bank;

import java.util.Scanner;

import java.util.Random;

public class main2 {

	public static void main(String[] args) {

		double sceltaUtente;

		String scelta = "";

		Scanner s = new Scanner(System.in);

		System.out.println("Nome?");

		String nome = s.nextLine();

		Random r = new Random();

		int numeroConto = r.nextInt(1000);

		conto2 c = new conto2(numeroConto, nome);

		while (!scelta.equals("chiudere")) {

			System.out.println("Cosa vuoi fare " + nome + "? " + "prelevare, depositare, chiudere?");

			scelta = s.nextLine();

			if (scelta.equals("depositare")) {

				System.out.println("Quanto?");

				double deposito = s.nextDouble();
				
				s.nextLine();

				c.mettiDenaro(deposito);

				System.out.println("il tuo saldo è" + c.ritornaSalda());

			} else if (scelta.equals("prelevare")) {

				System.out.println("Quanto?");

				double prelievo = s.nextDouble();
				
				s.nextLine();

				c.togliDenaro(prelievo);

				System.out.println("il tuo saldo è" + c.ritornaSalda());

				if (prelievo > c.ritornaSalda()) {

					System.out.println("Ma che fai?");
					System.out.println("il tuo saldo è" + c.ritornaSalda());

				}

			}

		}

		if (scelta.equals("chiudere")) {
			System.out.println("Ciao a presto");
		}

		s.close();

	}

}
