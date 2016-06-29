import java.util.Scanner;

/*
 * Ler o número de horas trabalhadas e o valor da hora do professor e imprimir o salário bruto e
 * líquido, sabendo que o desconto do IR segue a fórmula:
 * Salário menor ou igual a R$ 1200,00 – desconto ZERO
 * Salário maior que R$1200,00 e menor ou igual a R$ 1800,00 – desconto de 10%
 * Salário maior que R$1800,00 e menor ou igual a R$ 2200,00 – desconto de 15%
 * Salário maior que R$2200,00 – desconto de 27,5% 
 */
public class Lista01Ex06 {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		int horasTrabalhadas;
		float valorHoraAula, salarioBruto, salarioLiquido = 0;

		System.out.println("Digite a quantidade de horas trabalhadas pelo professor: \n");
		horasTrabalhadas = entradaDeDados.nextInt();

		System.out.println("Digite o valor da hora aula do professor: \n");
		valorHoraAula = entradaDeDados.nextFloat();

		salarioBruto = horasTrabalhadas * valorHoraAula;

		if (salarioBruto <= 1200) {
			salarioLiquido = salarioBruto;
		} else if (salarioBruto > 1200 && salarioBruto <= 1800) {
			salarioLiquido = salarioBruto - salarioBruto * 0.1f;
		} else if (salarioBruto > 1800 && salarioBruto <= 2200) {
			salarioLiquido = salarioBruto - salarioBruto * 0.15f;
		} else if (salarioBruto > 2200) {
			salarioLiquido = salarioBruto - salarioBruto * 0.275f;
		}

		System.out.printf("Valor do salário bruto: R$%.2f e salário líquido R$%.2f.", salarioBruto, salarioLiquido);
	}
}
