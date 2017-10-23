package Xadrez;

public class Cor {
	
	private final String PRETO = "p";
	private final String BRANCO = "b";
	private String cor;
	
	public Cor(String cor) {
		if (cor.equals(BRANCO)) {
			this.cor = BRANCO;
		}else {
			this.cor = PRETO;
		}
	}
	
	public String getCor() {
		return this.cor;
	}

}
