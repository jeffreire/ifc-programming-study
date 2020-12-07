package banco.coreBanco;

public class Conta {

	static int contas_abertas = 0;
	int numero;
	private float saldo;
	Usuario usuario;
	
	public Conta(Usuario usuario) {
		contas_abertas++;
		this.numero = contas_abertas;
		this.usuario = usuario;
		this.saldo = 0;
	}
	
	public float mostrarSaldo() {
		return this.saldo;
	}
	
	public boolean sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean depositar(float valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}

	public String toString(){
		return ";" + this.numero;
	}
}