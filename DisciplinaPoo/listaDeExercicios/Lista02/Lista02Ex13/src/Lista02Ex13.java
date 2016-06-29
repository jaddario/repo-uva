import java.util.Scanner;

/*
 * Ler um número inteiro n e imprimir todos os números perfeitos no intervalo de 1 a n. Número
 * perfeito é o número cujo somatório de todos os seus divisores (menos ele mesmo) é igual a ele.
 * Por exemplo: 6 = 1 + 2 + 3, logo 6 é um número perfeito.
 */
public class Lista02Ex13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o limite do intervalo:");
		int limiteDoIntervalo = entrada.nextInt();

		for (int numero = 1; numero < limiteDoIntervalo; numero++) {
			if (ehPerfeito(numero)) {
				System.out.printf("Numero %d é perfeito \n", numero);
			}
		}
	}

	private static boolean ehPerfeito(int numero) {
		int somaDosDivisores = 0;
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				somaDosDivisores += i;
			}
		}
		return (somaDosDivisores == numero);
	}

}