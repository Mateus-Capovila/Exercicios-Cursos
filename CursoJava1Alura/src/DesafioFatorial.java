
public class DesafioFatorial {

	public static void main(String[] args) {
		int n, fatorial = 1, result;
		for(n=1; n<=10; n++) {
			result = fatorial;
			fatorial *= n;
			System.out.println(result + " * " + n + " = " + fatorial);
		}
		System.out.println("\n10! = " + fatorial);

	}

}
