/*
  4 - Criar uma classe com nome ExecutarLinhaDeProducao.
	 4.1 Cria um m�todo chamado executarLinha
	 4.2 O m�todo executarLinha deve receber um inteiro como par�metro
	 4.3 Ent�o crie uma inst�ncia da classe Fabrica, atrav�s dessa inst�ncia execute o m�todo produzir da classe Fabrica 
	 e passa o par�metro recebido
	 4.4 Criar uma variavel que receba o retorno do m�todo produzir da Fabrica e imprimir as informa��es do produto produzido

  5 - Crie outro m�todo na classe ExecutarLinhaDeProducao chamado executarLinha1, 
	  e nesse m�todo chame o m�todo executarLinha passando zero ( 0)como par�metro.
  6 - Crie um o m�todo mais java na classe ExecutarLinhaDeProducao e instancia a classe e execute 
	  o m�todo executarLinha1, quantas vezes preferir.*/

package primeiralista;

public class ExecutarLinhaDeProducao {

	public void executarLinha(int teste) {

		Fabrica fabrica = new Fabrica();

		Produto produtoCriado = fabrica.produzir(teste);

		System.out.println(">>> Produto Criado <<<\n");
		System.out.println(" Nome :" + produtoCriado.descricao);
		System.out.println(" ID :" + produtoCriado.id);
		System.out.println(" ID :" + produtoCriado.descricao + "\n");
		System.out.println("--");

	}

	public void executarLinha01() {
		executarLinha(0);
	}
	
	public void executarLinha02() {
		executarLinha(4);
	}

	public static void main(String[] args) {
		new ExecutarLinhaDeProducao().executarLinha(4); /* O valor digitado dentro de exceturar linha faz a busca nas outras classes */
		new ExecutarLinhaDeProducao().executarLinha(2);
	}
}