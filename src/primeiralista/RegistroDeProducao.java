/*2 - Crie uma classe chamada RegistroDeProducao essa classe deve possuir um
atributo est�tico chamado registroSemanal.
O atributo registroSemanal deve ser um array [7][5][2], veremos a seguir como o
array dever� ser alimentado.
Crie outro atributo est�tico chamado diasDaSemana, que deve ser um array do tipo
String com 7 posi��es, e cada posi��o deve ser um dia da semana
Crie um atributo chamado produtos, que deve ser um array de tipo String de
tamanho 5. Cada item do array deve ser um nome de produto.*/

package primeiralista;

public class RegistroDeProducao {
	static int registroSemanal[][][] = new int[7][5][2];

	static String[] diasDaSemana = { "Domingo", "Segunda - feira", "Ter�a - feira", "Quarta - feira", "Quinta - Feira",
			"Sexta-Feira", "Sabado" };

	static String produtos[] = new String[5];
	int teste;

	{
		teste = 0;
		produtos[0] = "Teste1";
		produtos[1] = "Teste2";
		produtos[2] = "Teste3";
		produtos[3] = "Teste4";
		produtos[4] = "Teste5";
	}

}
