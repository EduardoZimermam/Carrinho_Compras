/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class CarrinhoCompras{

	public static CarrinhoCompras getInstance_Carrinho(){
	
		private static CarrinhoCompras carrinho;

		if (carrinho == NULL){									/*Construtor do Carrinho de compras seguindo o padrão Singleton*/
			 carrinho = new CarrinhoCompras();
		}
		return carrinho;
	}

}
