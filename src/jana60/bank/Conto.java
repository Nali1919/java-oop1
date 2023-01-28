package jana60.bank;

public class Conto {
	
	int numeroConto;
	String nome;
	double saldo;

	public Conto(String nome, int numeroConto, double saldo) {
		this.numeroConto = numeroConto;
		this.saldo = 0;
		this.nome = nome;
	}

	void deposita(double money) {
		this.saldo += money;
	}

	boolean preleva(double money) {
		if (money > this.saldo) {
			return false;
		} else {
			this.saldo -= money;
			return true;
		}
	}

}
