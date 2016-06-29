import java.util.Scanner;

/*
 * Ler um número inteiro n e imprimir o valor de H, dado pela série abaixo. Se n for menor ou
 * igual a ZERO, imprimir uma mensagem de erro.
 */
public class Lista02Ex14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de N: ");

		int inteiroPedido = entrada.nextInt();

		if (inteiroPedido <= 0) {
			System.out.println("Numero inválido.");
		} else {
			float somaDaSerie = 0;
		
			for (float i = 1; i <= inteiroPedido; i++) {
				somaDaSerie += (1 / i);
			}
			System.out.printf("H = %.3f ", somaDaSerie);
		}
	}
}