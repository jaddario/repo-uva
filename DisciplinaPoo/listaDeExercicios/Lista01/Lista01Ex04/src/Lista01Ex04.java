import java.util.Scanner;

/*
 * Ler uma temperatura em graus Celsius e transformá-la em graus Fahrenheit
 * Fórmula: C / 5 = (F - 32) / 9
 */
public class Lista01Ex04 {
	public static void main(String[] args) {
		Scanner entradaDeTemperatura = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: \n");
		float celsius = entradaDeTemperatura.nextFloat();

		System.out.printf("A temperatura em Fahrenheit é: %.2fF.", converteTemperaturaDeCelsiusParaFahrenheit(celsius));
	}

	private static float converteTemperaturaDeCelsiusParaFahrenheit(float celsius) {
		return (9 * celsius / 5) + 32;
	}
}