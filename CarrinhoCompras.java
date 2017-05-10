/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class CarrinhoCompras{
	public int totalItens;
	private static CarrinhoCompras carrinho;

	public static CarrinhoCompras getInstance_Carrinho(){
		if (carrinho == NULL){									/*Construtor do Carrinho de compras seguindo o padrão Singleton*/
			 carrinho = new CarrinhoCompras();
		}
		return carrinho;
	}

	public static Item getInstance_Item(int totalItens){
		Item item = new Item();				/*Construtor para os itens*/
		totalItens++;							

		return item;
	}

}
