import java.util.Scanner;

/*
 * Ler 3 valores inteiros do usuário e mostrar o maior deles, 
 * o menor deles e a média.
 */
public class Lista01Ex01 {
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

		// Pegando o maior número:
		int maiorNumero = 0;
		for (int j = 0; j < numerosEscolhidos.length; j++) {
			if (numerosEscolhidos[j] > maiorNumero) {
				maiorNumero = numerosEscolhidos[j];
			}
		}
		
		//Pegando o menor numero:
		int menorNumero = maiorNumero;
		for (int z = 0; z < numerosEscolhidos.length; z++) {
			if (numerosEscolhidos[z] < menorNumero) {
				menorNumero = numerosEscolhidos[z];
			}
		}
		
		
		System.out.printf("O maior número é: %d \n", maiorNumero);
		System.out.printf("O menor número é: %d \n", menorNumero);
	}
}
