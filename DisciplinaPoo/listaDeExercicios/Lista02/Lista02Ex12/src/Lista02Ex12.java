import java.util.Scanner;

/*
 * Ler os números inteiros x e n e calcular e x elevado a n.
 */
public class Lista02Ex12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o numero base: ");
		int base = entrada.nextInt();

		System.out.println("Digite a pontência: ");
		int potencia = entrada.nextInt();

		int resultadoDaPotenciacao = base;

		for (int i = 1; i < potencia; i++) {
			resultadoDaPotenciacao *= base;
		}
		System.out.printf("%d^%d = %d", base, potencia, resultadoDaPotenciacao);
	}
}
