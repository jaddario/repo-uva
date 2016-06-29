import java.util.Scanner;

/*
 * Ler dois números inteiros e 
 * imprimir os números ímpares no intervalo entre eles.
 */
public class Lista02Ex01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o limite inferior: \n");
		int menorNumero = entrada.nextInt();

		System.out.println("Digite o limite superior: \n");
		int maiorNumero = entrada.nextInt();

		System.out.printf("Os números ímpares no intervalo entre %d e %d são: \n", menorNumero, maiorNumero);
		for (int i = menorNumero; i <= maiorNumero; i++) {
			if (!(i % 2 == 0)) {
				System.out.println(i);
			}
		}
	}
}
