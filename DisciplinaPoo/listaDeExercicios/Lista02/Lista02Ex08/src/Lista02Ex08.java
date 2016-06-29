import java.util.Scanner;

/*
 * Ler valores positivos inteiros até que um valor negativo seja digitado pelo usuário. Ao final
 * imprimir a média dos números pares e a média dos números ímpares.
 */
public class Lista02Ex08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroLido, somaDosNumerosPares =0, somaDosNumerosImpares = 0, quantidadeDeNumerosPares = 0, quantidadeDeNumerosImpares = 0;
		
		for(;;){
			numeroLido = entrada.nextInt();
			if (numeroLido < 0) {
				break;
			}
			if (numeroLido%2==0) {
				somaDosNumerosPares+=numeroLido;
				quantidadeDeNumerosPares++;
			}else {
				somaDosNumerosImpares += numeroLido;
				quantidadeDeNumerosImpares++;
			}
		}
		System.out.printf("A media dos numeros Pares é: %.2f\n", (float)(somaDosNumerosPares/quantidadeDeNumerosPares));
		System.out.printf("A media dos numeros Impares é: %.2f\n", (float)(somaDosNumerosImpares/quantidadeDeNumerosImpares));
	}
}
