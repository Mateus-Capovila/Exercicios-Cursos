
public class Conta {
	private double saldo;
	private int agencia, numero;
	private String titular;
	private static int total;
	
	public Conta(double saldo, int agencia, int numero, String titular) {
		super();
		total ++;
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	

	public void depositar(double valor) {
		this.setSaldo(this.saldo += valor);
		System.out.println("Depósito realizado com sucesso na conta " + this.getNumero() + ", que pertence a " + this.getTitular());
	}
	
	public void sacar(double valor) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.saldo -= valor);
			System.out.println("Saque realizado com sucesso na conta " + this.getNumero() + ", que pertence a " + this.getTitular());
		}
		else {
			System.out.println("Não é possível sacar " + valor + " pois seu saldo é " + this.getSaldo());
		}
		
	}
	
	public void transferir(double valor, Conta destino) {
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.saldo -= valor);
			destino.setSaldo(destino.saldo += valor);
			System.out.println("Transferência realizada com sucesso da conta " + this.getNumero() + ", que pertence a " + this.getTitular() + " para a conta " + destino.getNumero() + ", que pertence a " + destino.getTitular());
		}
		else {
			System.out.println("Não é possível transferir " + valor + " pois seu saldo é " + this.getSaldo());
		}
	}

}
