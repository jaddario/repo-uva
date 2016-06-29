
public class Funcionario {
	private int matricula;
	private String nome;
	private float salario;

	public Funcionario(int matricula, String nome, float salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}

	public float ganhouAnual() {
		return (12 * salario) + salario + (salario / 3);
	}

	public float descontoIR() {
		if (salario < 1500) {
			return 0;
		} else if (salario >= 1500 && salario <= 5000) {
			return salario * 0.15f;
		} else {
			return salario * 0.25f;
		}
	}

}
