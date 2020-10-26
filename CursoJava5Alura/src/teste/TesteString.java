/**
 * Classe para testar Strings
 * @author Mateus Capovila
 *
 */
package teste;

public class TesteString {

	public static void main(String[] args) {
		String nome = "Mateus";
		String outro = new String("oi");
		String novo = outro.toUpperCase();
		System.out.println(novo);
		
		char c = nome.charAt(3);
		System.out.println(c);
		int pos = nome.indexOf("eus");
		System.out.println(pos);
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for(int i=0; i<nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

	}

}
