package jana60.bank;

public class conto2 {

	int numeroDiConto;
	String nomeProprietario;
	double saldo;

	public conto2(int numeroDiConto, String nomeProprietario) {
		super();
		this.numeroDiConto = numeroDiConto;
		this.nomeProprietario = nomeProprietario;
		this.saldo = 0;
	}

	double mettiDenaro(double soldi) {

		return this.saldo += soldi;

	}

	boolean togliDenaro(double soldi) {

		if (soldi > saldo) {

			return false;
		} else {
			this.saldo -= soldi;
			return true;
		}

	}
	
	double ritornaSalda () {
		return this.saldo;
	}

}
