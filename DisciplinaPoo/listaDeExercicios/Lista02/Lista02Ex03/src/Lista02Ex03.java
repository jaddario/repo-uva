import java.util.Scanner;

/*
 * Ler os números inteiros n, m e k e imprimir os números no intervalo de n a m que são divisíveis
 * por k.
 */
public class Lista02Ex03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o intervalo inferior: \n");
		int menorNumero = entrada.nextInt();

		System.out.println("Digite o intervalo superior: \n");
		int maiorNumero = entrada.nextInt();

		System.out.println("Digite o numero a ser comparado: \n");
		int numeroConstanteASerComparado = entrada.nextInt();
		
		if (maiorNumero<menorNumero) {
			int swapNumber = maiorNumero;
			maiorNumero = menorNumero;
			menorNumero = swapNumber;
		}

		System.out.printf("Os numeros divisiveis por %d no intervalo entre %d e %d são: \n",
				numeroConstanteASerComparado, menorNumero, maiorNumero);
		for (int i = menorNumero; i < maiorNumero; i++) {
			if (i % numeroConstanteASerComparado == 0) {
				System.out.println(i);
			}
		}
	}

}
