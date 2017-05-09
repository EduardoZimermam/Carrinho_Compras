/**
  * @author Eduardo Zimermam Pereira
  *
  */


public interface User{
	String nome,
		   email,
		   id_U;
}

public class Item{
	String preco,
	       data_Entrega, 
	       marca, 
	       especif, 
	       id_I; 
}

public class CarrinhoCompras extends Item implements User{
	public int totalItens;
	private static CarrinhoCompras carrinho;

	public static CarrinhoCompras getInstance_Carrinho(){
		if (carrinho == NULL){									/*Construtor do Carrinho de compras seguindo o padrão Singleton*/
			 carrinho = new CarrinhoCompras();
		}
		return carrinho;
	}

	public static Item getInstance_Item(){
		Item item = new Item();				/*Construtor para os itens*/
		totalItens++;							

		return item;
	}

}
