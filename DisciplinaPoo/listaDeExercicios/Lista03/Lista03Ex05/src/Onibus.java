
public class Onibus {
	private int quantidadeMaximaDePassageiros;
	private float valorDaPassagem;
	private int quantidadeAtualDePassageiros;

	public Onibus(float valorDaPassagem, int quantidadeMaximaDePassageiros) {
		this.valorDaPassagem = valorDaPassagem;
		this.quantidadeMaximaDePassageiros = quantidadeMaximaDePassageiros;
	}

	public boolean entrar(int qtdPassageiros) {
		if (quantidadeAtualDePassageiros + qtdPassageiros > quantidadeMaximaDePassageiros) {
			return false;
		} else {
			quantidadeAtualDePassageiros += qtdPassageiros;
			return true;
		}
	}

	public boolean sair(int qtdPassageiros) {
		if (quantidadeAtualDePassageiros - qtdPassageiros < 0) {
			return false;
		} else {
			quantidadeAtualDePassageiros -= qtdPassageiros;
			return true;
		}
	}

	public float faturamento() {
		return quantidadeAtualDePassageiros * valorDaPassagem;
	}

	public int qtdPassageiros() {
		return quantidadeAtualDePassageiros;
	}
}
