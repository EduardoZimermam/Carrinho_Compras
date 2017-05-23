/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class Item{
	String preco,
	       data_Entrega, 
	       marca, 							/** Classe que define o item**/
	       especif, 
	       id_I; 
	public int totalItens;


	 public static Item getInstance_Item(int totalItens){
		Item item = new Item();										/*Construtor para os itens*/
		totalItens++;							

		return item;
	}

}