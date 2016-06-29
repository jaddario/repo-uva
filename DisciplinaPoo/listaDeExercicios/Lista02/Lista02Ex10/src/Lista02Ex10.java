import java.util.Scanner;

/*
 * Ler um inteiro n e imprimir se ele é ou não primo.
 */
public class Lista02Ex10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero para verificar se ele é ou não primo: ");
		int numeroAnalisado = entrada.nextInt();
		
		int divisor = 1, numeroDeDivisores = 0;
		
		while (divisor < numeroAnalisado) {
			if (numeroAnalisado % divisor == 0) {
				numeroDeDivisores++;
			}
			divisor++;
		}

		if (numeroDeDivisores == 1) {
			System.out.printf("O numero %d é primo.", numeroAnalisado);
		} else {
			System.out.printf("O numero %d não é primo.", numeroAnalisado);
		}
	}
}
