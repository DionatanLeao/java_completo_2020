package br.com.java.estrutura_condicional;

/***
 * 
 * @author dionatan
 *
 */

public class OperadorTernario {

	public static void main(String[] args) {

		/***
		 * ? Verdadeiro : Falso
		 */

		double preco = 34.5;
		@SuppressWarnings("unused")
		double desconto;

		if (preco < 20.0) {
			desconto = preco * 0.1;
		} else {
			desconto = preco * 0.05;
		}

		double preco2 = 34.5;
		@SuppressWarnings("unused")
		double desconto2 = (preco2 < 20.0) ? preco2 * 0.1 : preco2 * 0.05;
	}

}
