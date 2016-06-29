import java.util.Scanner;

/*
 * Ler 3 valores numéricos e imprimir a soma 
 * dos 2 maiores e a diferença dos 2 menores.
 */
public class Lista01Ex02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numerosEscolhidos = new int[3];

		// Lendo os tres numeros:
		int index = 0;
		while (index < 3) {
			System.out.printf("Digite o %dº numero: \n", index + 1);
			numerosEscolhidos[index] = entrada.nextInt();
			index++;
		}
		// Ordenando o vetor:
		int variavelAuxiliar = 0;
		for (int i = 0; i < numerosEscolhidos.length; i++) {
			for (int j = 0; j < numerosEscolhidos.length; j++) {
				if (numerosEscolhidos[i] > numerosEscolhidos[j]) {
					variavelAuxiliar = numerosEscolhidos[j];
					numerosEscolhidos[j] = numerosEscolhidos[i];
					numerosEscolhidos[i] = variavelAuxiliar;
				}
			}

		}
		// Fazendo a soma e a subtração.
		System.out.printf("A soma dos dois primeiros é: %d \n", numerosEscolhidos[0] + numerosEscolhidos[1]);
		System.out.printf("A subtração dos dois últimos é: %d \n", numerosEscolhidos[1] - numerosEscolhidos[2]);
	}
}