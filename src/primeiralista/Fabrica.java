/*
 3 Crie uma classe Fabrica que não tenha um método main
	3.1 - Na classe Fabrica crie um método chamado produzir:
	3.2 - O método deve receber um parâmetro do tipo inteiro
	3.3 - O inteiro recebido deve ser usado para recuperar o nome do produto na variável estática produtos que foi criada na 
		classe RegistroDeProducao na etapa 2.
	3.4 - ATENÇÃO: deve ser criada uma validação para procurar o produto apenas se o parâmetro passado é menor ou que o tamanho do array produtos da classe
	RegistroDeProducao
	3.5 - Criar uma instância da classe Produto e atribuir o nome do produto encontrado no array ao atributo descricao classe Produto
	3.6 - O método produzir deve retornar o produto criado
	
	>>> fase 2 <<<
	1 - Na classe Fabrica crie o método rodarEsteira que recebe 3 parâmetros inteiros:
		produto, qtd e diaDaSemana
	2 - O método rodarEsteira deve retornar um array de produtos
	3 - no método rodarEsteira 
		crie um array de produtos e o inicialize com o parâmetro qtd

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
