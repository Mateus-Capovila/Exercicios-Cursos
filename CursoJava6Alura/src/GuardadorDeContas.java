
public class GuardadorDeContas {

	private Conta[] referencias;
	private int posicao;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicao = 0;
	}
	
	public void adiciona(Conta ref) {
		referencias[this.posicao] = ref;
		this.posicao ++;
	}
	
	public int getTamanho() {
		return this.posicao;
	}
	
	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}

