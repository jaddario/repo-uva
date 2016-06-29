/*
 * Crie a classe Numero que deverá ter um atributo n do tipo float. Nessa classe, implemente os
 * métodos:
 * 1 float fatorial() que deverá retornar n!.
 * 2 float potencia(int x) que deverá retorna n x .
 * 3 int parteInteira() que deverá retorna a parte inteira de n.
 * 4 float parteDecimal() que deverá retorna a parte decimal de n.
 */
public class Lista03Ex01 {
	public static void main(String[] args) {
		Numero num = new Numero(3.5f);
		System.out.println(num.fatorial());
		System.out.println(num.potencia(3));
		System.out.println(num.parteInteira());
		System.out.println(num.parteDecimal());
	}
}
