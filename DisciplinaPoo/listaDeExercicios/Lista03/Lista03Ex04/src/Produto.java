
public class Produto {
	private int código;
	private String descrição;
	private float precoDeCusto;
	private float precoDeVenda;
	private float margemDeLucro;

	public Produto(int código, String descrição, float precoDeCusto) {
		this.código = código;
		this.descrição = descrição;
		this.precoDeCusto = precoDeCusto;
	}

	public void setMargemLucro(float percentual) {
		this.margemDeLucro = percentual;
		this.precoDeVenda = precoDeCusto + (precoDeCusto * margemDeLucro);
	}

	public float getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoVenda(float valor) {
		this.precoDeVenda = valor;
		this.margemDeLucro = precoDeVenda - precoDeCusto;
	}

	public float getMargemDeLucro() {
		return margemDeLucro;
	}
}
