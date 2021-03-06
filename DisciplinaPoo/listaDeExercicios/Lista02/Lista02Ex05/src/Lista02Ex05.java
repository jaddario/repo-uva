import java.util.Scanner;

/*
 * O número 3025 possui a seguinte característica: 30 + 25 = 55 => 55*55 = 3025. Fazer um
 * programa para obter todos os números de 4 algarismos com a mesma característica do número
 * 3025.
 */
public class Lista02Ex05 {

	public static void main(String[] args) {

		System.out.println("Os numeros que atendem à caracterista são: \n");

		String stringDoNumeroAnalisado;
		int numeroAnalisado = 1000;
		int primeiraParteDoNumero;
		int segundaParteDoNumero;
		int somaDasPartes;
		
		for (int i = 1000; i <= 9999; i++) {
			stringDoNumeroAnalisado = String.valueOf(numeroAnalisado);

			primeiraParteDoNumero = Integer.parseInt(stringDoNumeroAnalisado.substring(0, 2));
			segundaParteDoNumero = Integer.parseInt(stringDoNumeroAnalisado.substring(2, 4));
			somaDasPartes = primeiraParteDoNumero + segundaParteDoNumero;

			if ((somaDasPartes * somaDasPartes) == Integer.parseInt(stringDoNumeroAnalisado)) {
				System.out.println(stringDoNumeroAnalisado);
			}
			numeroAnalisado++;
		}
		System.out.println("fim");

	}
}
