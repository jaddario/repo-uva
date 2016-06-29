import java.util.Scanner;

/*
 * Ler um inteiro n e imprimir seus divisores.
 */
public class Lista02Ex09 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero para saber seus divisores:");
		int numeroAnalisado = entrada.nextInt();

		int divisor = 2;
		while (numeroAnalisado > 1) {
			if (numeroAnalisado % divisor == 0) {
				System.out.printf("%d | %d \n", numeroAnalisado, divisor );
				numeroAnalisado = numeroAnalisado / divisor;
			} else {
				divisor++;
			}
		}
	}
}
