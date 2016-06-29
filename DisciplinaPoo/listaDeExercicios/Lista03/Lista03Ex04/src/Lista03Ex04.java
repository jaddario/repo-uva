/*
 * Crie uma classe Produto com código, descrição, preço de custo, preço de venda e margem de
 * lucro. Implemente os métodos:
 * 		Construtor para código, descrição e preço de custo.
 * 
 * 		void setMargemLucro(float percentual) que deverá alterar a margem de
 * 		lucro e calcular o preço de venda correspondente.
 * 
 * 		void setPrecoVenda(float valor) que deverá alterar o preço de venda e
 * 		calcular a margem de lucro correspondente.
 */
public class Lista03Ex04 {
	public static void main(String[] args) {
		Produto sabao = new Produto(001, "Sabão em po", 5);
		Produto desodorante = new Produto(002, "Rexona", 7);
		
		desodorante.setPrecoVenda(15);
		System.out.println(desodorante.getPrecoDeVenda());
		System.out.println(desodorante.getMargemDeLucro());
		
		
	}
}
