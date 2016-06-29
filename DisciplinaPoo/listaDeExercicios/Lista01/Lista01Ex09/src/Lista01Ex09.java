import java.util.Scanner;

/*
 * Ler um número inteiro de 100 a 999 e imprimir a soma dos dígitos que compõem o número. 
 * Se o número não estiver nesse intervalo emitir uma mensagem de erro.
 */
public class Lista01Ex09 {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);
		System.out.println("Digite um numero inteiro de 100 a 999: \n");
		int numeroEscolhido = entradaDeDados.nextInt();
		if (numeroEscolhido >= 100 && numeroEscolhido <= 999) {
			char[] arrayDeDigitosDoNumeroEscolhido = String.valueOf(
					numeroEscolhido).toCharArray();
			int somaDosDigitos = 0;
			for (char digito : arrayDeDigitosDoNumeroEscolhido) {
				somaDosDigitos += Integer.parseInt(String.valueOf(digito));
			}
			System.out.printf("A soma dos digitos que compõe o numero escolhido é: %d \n", somaDosDigitos);
		} else {
			System.out.println("numero inválido");
		}
	}
}
