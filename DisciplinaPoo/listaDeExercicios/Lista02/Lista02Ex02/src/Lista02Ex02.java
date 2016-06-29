import java.util.Scanner;

/*
 * Altere o exercício 1 para que, se n for maior que m, 
 * os valores do intervalo sejam invertidos, ou
 * seja, imprimir os ímpares no intervalo de m a n.
 */
public class Lista02Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o limite inferior: \n");
		int menorNumero = entrada.nextInt();

		System.out.println("Digite o limite superior: \n");
		int maiorNumero = entrada.nextInt();

		if (menorNumero < maiorNumero) {
			System.out.printf("Os números ímpares no intervalo entre %d e %d são: \n", menorNumero, maiorNumero);
			for (int i = menorNumero; i <= maiorNumero; i++) {
				if (!(i % 2 == 0)) {
					System.out.println(i);
				}
			}
		} else if (maiorNumero < menorNumero) {
			System.out.printf("Os números ímpares no intervalo entre %d e %d são: \n", maiorNumero, menorNumero);
			for (int i = maiorNumero; i <= menorNumero; i++) {
				if (!(i % 2 == 0)) {
					System.out.println(i);
				}
			}
		}
	}

}
