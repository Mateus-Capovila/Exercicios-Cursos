
public class CriaConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(200, 1234, 5678, "Clark");
		Conta conta2 = new Conta(50, 9999, 1111, "Lois");
		
		System.out.println("Total de contas criadas: " + Conta.getTotal());
		
		System.out.println("Saldo da conta " + conta1.getNumero() + ", que pertence a " + conta1.getTitular() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumero() + ", que pertence a " + conta2.getTitular() + ": " + conta2.getSaldo());
		System.out.println("");
		
		conta1.depositar(25);
		System.out.println("Saldo da conta " + conta1.getNumero() + ", que pertence a " + conta1.getTitular() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumero() + ", que pertence a " + conta2.getTitular() + ": " + conta2.getSaldo());
		System.out.println("");
		
		conta1.sacar(100);
		System.out.println("Saldo da conta " + conta1.getNumero() + ", que pertence a " + conta1.getTitular() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumero() + ", que pertence a " + conta2.getTitular() + ": " + conta2.getSaldo());
		System.out.println("");
		
		conta1.transferir(50, conta2);
		System.out.println("Saldo da conta " + conta1.getNumero() + ", que pertence a " + conta1.getTitular() + ": " + conta1.getSaldo());
		System.out.println("Saldo da conta " + conta2.getNumero() + ", que pertence a " + conta2.getTitular() + ": " + conta2.getSaldo());
		System.out.println("");

	}

}
