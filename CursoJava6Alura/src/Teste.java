
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		int tamanho = lista.size();
		System.out.println(tamanho);
		
		int ref =lista.indexOf(0);
		System.out.println(ref);
		System.out.println("");
		
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		
		int valor = idadeRef.intValue();
		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(29);
		System.out.println("");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		CompararNumeroConta comparator = new CompararNumeroConta();
		lista.sort(comparator);

	}

}

class CompararNumeroConta implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		
		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
	}
	
}
