/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class CarrinhoCompras{
	private static CarrinhoCompras carrinho;

	public static CarrinhoCompras getInstance_Carrinho(){
		if (carrinho == NULL){									/*Construtor do Carrinho de compras seguindo o padrão Singleton*/
			 carrinho = new CarrinhoCompras();
		}
		return carrinho;
	}

}
