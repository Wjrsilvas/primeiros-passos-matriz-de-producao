/*
  4 - Criar uma classe com nome ExecutarLinhaDeProducao.
	 4.1 Cria um método chamado executarLinha
	 4.2 O método executarLinha deve receber um inteiro como parâmetro
	 4.3 Então crie uma instância da classe Fabrica, através dessa instância execute o método produzir da classe Fabrica 
	 e passa o parâmetro recebido
	 4.4 Criar uma variavel que receba o retorno do método produzir da Fabrica e imprimir as informações do produto produzido

  5 - Crie outro método na classe ExecutarLinhaDeProducao chamado executarLinha1, 
	  e nesse método chame o método executarLinha passando zero ( 0)como parâmetro.
  6 - Crie um o método mais java na classe ExecutarLinhaDeProducao e instancia a classe e execute 
	  o método executarLinha1, quantas vezes preferir.*/

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