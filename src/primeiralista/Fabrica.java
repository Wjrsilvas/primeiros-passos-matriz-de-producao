/*
 3 Crie uma classe Fabrica que n�o tenha um m�todo main
	3.1 - Na classe Fabrica crie um m�todo chamado produzir:
	3.2 - O m�todo deve receber um par�metro do tipo inteiro
	3.3 - O inteiro recebido deve ser usado para recuperar o nome do produto na vari�vel est�tica produtos que foi criada na 
		classe RegistroDeProducao na etapa 2.
	3.4 - ATEN��O: deve ser criada uma valida��o para procurar o produto apenas se o par�metro passado � menor ou que o tamanho do array produtos da classe
	RegistroDeProducao
	3.5 - Criar uma inst�ncia da classe Produto e atribuir o nome do produto encontrado no array ao atributo descricao classe Produto
	3.6 - O m�todo produzir deve retornar o produto criado
	
	>>> fase 2 <<<
	1 - Na classe Fabrica crie o m�todo rodarEsteira que recebe 3 par�metros inteiros:
		produto, qtd e diaDaSemana
	2 - O m�todo rodarEsteira deve retornar um array de produtos
	3 - no m�todo rodarEsteira 
		crie um array de produtos e o inicialize com o par�metro qtd

*/
package primeiralista;

public class Fabrica {

	public Produto produzir(int produto) {
			
		if (RegistroDeProducao.produtos.length > produto) {
			String nomeProduto = new RegistroDeProducao().produtos[produto];

			// cria um novo produto
			Produto novoProduto = new Produto();
			novoProduto.descricao = nomeProduto;

			// retorna o produto criado
			return novoProduto;

		}

		// retorna um produto vazio */
	
		Produto novoProduto = new Produto();

		novoProduto.descricao = "Produto Indefinido";
		
		return novoProduto;
	}
}
