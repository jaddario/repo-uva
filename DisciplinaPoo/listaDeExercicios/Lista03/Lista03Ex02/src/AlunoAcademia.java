
public class AlunoAcademia {
	private float peso;
	private float altura;

	public AlunoAcademia(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	public float imc(){
		return peso /(altura * altura);
	}
	
	public float pesoMinimo(){
		return 18.5f * (altura * altura);
	}
	
	public float pesoMaximo(){
		return 24.9f * (altura * altura);
	}
	
	public float pesoMedio(){
		return ((pesoMinimo() +  pesoMaximo()) / 2);
	}
	
}
