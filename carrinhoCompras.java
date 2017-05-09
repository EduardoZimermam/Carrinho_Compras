/* *
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
	int totalItens;
	private static CarrinhoCompras carrinho;

	public static CarrinhoCompras getInstance(){
		if (carrinho == NULL){											/*Carrinho de compras sendo instanciado seguindo o padrão Singleton*/
			 carrinho = new CarrinhoCompras();
		}
		return carrinho;
	}

}
