import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

/*
 * Ler um número inteiro n e imprimir o valor de H, dado pela série abaixo. Se n for menor ou
 * igual a ZERO, imprimir uma mensagem de erro.
 */
public class Lista02Ex15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero inteiro positivo: ");
		int numeroInteiroN = entrada.nextInt();

		if (numeroInteiroN <= 0) {
			System.out.println("numero não pode ser menor ou igual a zero.");
		} else {
			float somaDaSerie = 0;

			for (float i = 1; i <= numeroInteiroN; i++) {
				somaDaSerie += (numeroInteiroN / i);
			}
			System.out.printf("H = %.2f", somaDaSerie);
		}
	}
}