import java.util.Scanner;
import java.util.SortedMap;

/*
 * O número 3025 possui a seguinte característica: 30 + 25 = 55 => 55*55 = 3025. 
 * Fazer um programa para ler um número inteiro de 4 dígitos e verificar se ele possui essa propriedade.
 * Imprima a primeira parte do número, a segunda parte e o valor da multiplicação. 
 * Caso o usuário digite um número que não tenha 4 dígitos, apresente uma mensagem de erro.
 */

//Refatorar esse código pq tá uma bosta.
public class Lista01Ex10 {
	public static void main(String[] args) {
		Scanner entradaDeNumero = new Scanner(System.in);

		System.out.println("Digite um número com 4 digitos: \n");
		int numeroEscolhido = entradaDeNumero.nextInt();

		if (ehUmNumeroValido(numeroEscolhido) && oNumeroAtendeACaracteristica(numeroEscolhido)) {
			int[] vetor = decompoeNumero(numeroEscolhido);
			int somaDosParesDecompostos = vetor[0] + vetor[1];
			System.out.printf("Dois primeiros numeros: %d \n", vetor[0]);
			System.out.printf("Dois segundos numeros: %d \n", vetor[1]);
			System.out.printf("A multiplicação dos pares: %d \n", somaDosParesDecompostos * somaDosParesDecompostos);

		} else if (ehUmNumeroValido(numeroEscolhido) && !oNumeroAtendeACaracteristica(numeroEscolhido)) {
			System.out.println("O numero é válido, mas não atende à característica");
		} else {
			System.out.println("Numero deve conter 4 algarismos.");
		}
	}

	private static boolean oNumeroAtendeACaracteristica(int numeroEscolhido) {
		int[] vetorDeAlgarismosDoNumeroEscolhido = decompoeNumero(numeroEscolhido);
		int somaDasMetadesDoNumero = vetorDeAlgarismosDoNumeroEscolhido[0] + vetorDeAlgarismosDoNumeroEscolhido[1];
		return ((somaDasMetadesDoNumero * somaDasMetadesDoNumero) == numeroEscolhido);
	}

	private static int[] decompoeNumero(int numeroEscolhido) {
		char[] arrayDeDigitosDoNumeroEscolhido = String.valueOf(numeroEscolhido).toCharArray();
		int[] vetorDeDigitos = new int[2];

		vetorDeDigitos[0] = Integer.parseInt(Character.toString(arrayDeDigitosDoNumeroEscolhido[0])
				+ Character.toString(arrayDeDigitosDoNumeroEscolhido[1]));

		vetorDeDigitos[1] = Integer.parseInt(Character.toString(arrayDeDigitosDoNumeroEscolhido[2])
				+ Character.toString(arrayDeDigitosDoNumeroEscolhido[3]));

		return vetorDeDigitos;
	}

	private static boolean ehUmNumeroValido(int numeroEscolhido) {
		char[] digitos = String.valueOf(numeroEscolhido).toCharArray();
		return (digitos.length == 4);
	}
}
