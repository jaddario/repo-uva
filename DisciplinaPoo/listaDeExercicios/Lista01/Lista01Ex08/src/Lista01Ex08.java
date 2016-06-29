import java.util.Scanner;

/*
 * Ler os valores inteiros x, y e z e determinar se estes valores podem formar os lados de um triângulo. 
 * Em caso afirmativo, informar se o triângulo é equilátero, isósceles ou escaleno. Definições:
 * 		Triângulo: a soma de dois lados quaisquer tem que ser maior que o terceiro lado
 * 		Triângulo equilátero: possui os 3 lados iguais.
 * 		Triângulo isósceles: possui 2 lados iguais e o terceiro diferente
 * 		Triângulo escaleno: possui os 3 lados diferentes.
 */
public class Lista01Ex08 {
	public static void main(String[] args) {
		Scanner entradaDeDados = new Scanner(System.in);

		System.out.println("Digite o lado A do triangulo: \n");
		int ladoA = entradaDeDados.nextInt();

		System.out.println("Digite o lado B do triangulo: \n");
		int ladoB = entradaDeDados.nextInt();

		System.out.println("Digite o lado C do triangulo: \n");
		int ladoC = entradaDeDados.nextInt();

		if (isTriangule(ladoA, ladoB, ladoC)) {
			System.out.printf("O tipo de triangulo é: %s", determinaOTipoDoTriangulo(ladoA, ladoB, ladoC));
		} else {
			System.out.println("Os lados informados não formam um triângulo");
		}
	}

	private static String determinaOTipoDoTriangulo(int ladoA, int ladoB, int ladoC) {
		if (ladoA == ladoB && ladoA == ladoC) {
			return "Triangulo equilátero";
		} else if (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) {
			return "Triângulo isosceles";
		} else {
			return "Triângulo escaleno";
		}
	}

	private static boolean isTriangule(int ladoA, int ladoB, int ladoC) {
		return (ladoA + ladoB > ladoC || ladoA + ladoC > ladoB || ladoB + ladoC > ladoA);
	}
}
