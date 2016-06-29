/*
 * Crie uma classe Funcionario com matrícula, nome e salário. Implemente os métodos:
 * 	float ganhoAnual() que calcula quanto o funcionário ganha no ano. O ganho anual
 * 	é de 12x o salário, mais décimo terceiro e mais 1/3 de abono de férias.
 * 	float descontoIR() que calcula o desconto no imposto de renda que é de ZERO
 * 	para quem ganha até R$ 1500,00/mês, 15% para quem ganha até R$ 5000,00/mês e de
 * 	25% para quem ganha acima de R$ 5000,00/mês.
 */
public class Lista03Ex03 {
	public static void main(String[] args) {
		Funcionario joao = new Funcionario(001, "João Pedro", 5000);
		Funcionario jose = new Funcionario(002, "Jose da Silva", 1000);
		Funcionario maria = new Funcionario(003, "Maria Souza", 7000);
		
		System.out.println(joao.ganhouAnual());
		System.out.println(joao.descontoIR());
		System.out.println(jose.ganhouAnual());
		System.out.println(jose.descontoIR());
	
	}
}
