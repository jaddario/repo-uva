import java.util.Scanner;

/*
 * Ler um numero inteiro n e informar quantos dígitos ele tem.
 */
public class Lista02Ex06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o numero inteiro a ser analisado: \n");
		String numeroASerAnalisado = entrada.nextLine();
		
		System.out.printf("O numero tem %d digitos.", numeroASerAnalisado.length());
		
	}
}
