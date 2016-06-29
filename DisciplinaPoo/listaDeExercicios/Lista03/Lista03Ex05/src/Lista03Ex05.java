/*
 * Crie a classe Onibus que representa um ônibus com a quantidade máxima de passageiros e o
 * preço da passagem. Nessa classe, implemente os métodos:  
 * 	boolean entrar(int qtdPassageiros) que realiza a entrada de
 * 	qtdePassageiros no ônibus. Se não couberem esses passageiros no ônibus o método
 * 	deverá retonar false.
 * 	boolean sair(int qtdPassageiros) que realiza a saída de qtdePassageiros no ônibus. Se não existirem esses passageiros no ônibus o método
 * 	deverá retonar false.
 * 	float faturamento() que retorna o total faturado com as passagens.
 * 	int qtdePassageiros() que retorna a quantidade de passageiros no ônibus.
 */
public class Lista03Ex05 {
	public static void main(String[] args) {
		Onibus meier = new Onibus(3.8f, 70);
		meier.entrar(12);
		meier.entrar(45);
		meier.sair(23);
		System.out.println(meier.qtdPassageiros());
		System.out.println(meier.faturamento());
	}
}