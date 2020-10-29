
import java.util.ArrayList;
import java.util.Collection;

public class TesteComEquals {

	public static void main(String[] args) {
		Collection<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		for(Conta conta : lista) {
			if(conta.equals(cc2)) {
				System.out.println("A conta já existe");
			}
		}
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
