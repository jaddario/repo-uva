import java.util.Scanner;

/*
 * Ler números inteiros até que o usuário digite zero ou um número negativo. Ao final imprimir a
 * soma e a média aritmética dos números digitados, o menor e o maior número
 */
public class Lista02Ex07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroN, somaNumeros = 0, quantidadeDeNumeros = 0;

		for (;;) {
			System.out.println("Digite um  numero para calcular a média. \n");
			numeroN = entrada.nextInt();
			if ((numeroN == 0) || (numeroN < 0)) {
				break;
			}
			somaNumeros += numeroN;
			quantidadeDeNumeros++;
		}
		System.out.printf("A media dos numeros digitados é: %.2f ", 
				(float) (somaNumeros / quantidadeDeNumeros));
	}
}
