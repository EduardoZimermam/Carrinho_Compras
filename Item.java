/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class Item{
	String preco,
	       data_Entrega, 				/*Classe que gera o objeto item.*/
	       marca, 							
	       especif, 
	       id_I; 
	
	public static int totalItens;



	public static Item getInstance_Item(){
		Item item = new Item();							/*Método responsável pela instanciação de cada Item, fazendo uma contagem de cada item que esta no carrinho*/										
		totalItens++;							                      

		return item;
	}

}