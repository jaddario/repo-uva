/*
 * Crie a classe AlunoAcademia que representa o aluno de uma academia. Para esse aluno
 * devem ser registrados, obrigatoriamente, o peso e a altura. Nessa classe, implemente os
 * métodos:
 *  float imc() que calcula o IMC baseado na fórmula peso / altura 2
 *  float pesoMinimo() que calcula o peso mínimo baseado na fórmula 18.5 * altura 2
 *  float pesoMaximo() que calcula o peso máximo baseado na fórmula 24.9 * altura 2
 *  float pesoMedio() que calcula o peso médio baseado na fórmula (peso mínimo +
 *  peso máximo) / 2
 */
public class Lista03Ex02 {
	public static void main(String[] args) {
		AlunoAcademia pedro = new AlunoAcademia(60, 1.9f);
		
		System.out.println(pedro.imc());
		System.out.println(pedro.pesoMinimo());
		System.out.println(pedro.pesoMaximo());
		System.out.println(pedro.pesoMedio());
	}
}
