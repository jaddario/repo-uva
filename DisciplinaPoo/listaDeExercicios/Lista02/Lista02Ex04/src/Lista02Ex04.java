import java.util.Scanner;

/*
 * Ler os números inteiros n, m e k e imprimir a soma e a média dos números no intervalo de n a
 * m que são divisíveis por k.
 */
public class Lista02Ex04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o intervalo inferior: \n");
		int menorNumero = entrada.nextInt();

		System.out.println("Digite o intervalo superior: \n");
		int maiorNumero = entrada.nextInt();

		System.out.println("Digite o numero a ser comparado: \n");
		int numeroConstanteASerComparado = entrada.nextInt();

		if (maiorNumero < menorNumero) {
			int swapNumber = maiorNumero;
			maiorNumero = menorNumero;
			menorNumero = swapNumber;
		}
		int somaDosNumerosDivisiveis = 0;
		int count = 0;
		for (int i = menorNumero; i <= maiorNumero; i++) {
			if (i % numeroConstanteASerComparado == 0) {
				somaDosNumerosDivisiveis += i;
				count++;
			}
		}
		System.out.printf("A soma dos numeros divisiveis por %d é %d e a média é %.2f", numeroConstanteASerComparado,
				somaDosNumerosDivisiveis, (float)(somaDosNumerosDivisiveis / count));
	}
}
