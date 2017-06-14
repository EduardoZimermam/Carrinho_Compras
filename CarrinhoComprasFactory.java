/**
  * @author Eduardo Zimermam Pereira
  *
  */

import java.util.ArrayList;

public class CarrinhoComprasFactory implements CarrinhoComprasCommand{
	private static CarrinhoComprasFactory carrinho;
	ArrayList <Item> item = new ArrayList <Item>();
	static int totalItens;
	String id_C;

	public static CarrinhoComprasFactory getInstanceCarrinho(String name, String e_mail, String id_U, String id_C){

		if (carrinho == null){								
			carrinho = new CarrinhoComprasFactory();
			System.out.println("Criando o carrinho de compras: "+id_C);				/** Método get para instanciar o carrinho de compras **/
			Usuario user = Usuario.getInstanceUsuario(name, e_mail, id_U);	
		}

		return carrinho;
	}

	@Override
	public ArrayList<Item> incluiItem(String valor, String data, String marca, String obs, String ident){
		Item newItem = new Item();

		System.out.println("Incluindo o item " +ident+ " ao carrinho de compras.");

		newItem.preco = valor;
		newItem.dataEntrega = data;
		newItem.marca = marca;
		newItem.especificacao = obs;
		newItem.id = ident;

		item.add(newItem);
		totalItens++;

		return item;
	}

	@Override
	public ArrayList<Item> excluiItem(String ident){
		int i = 0;

		while(item.get(i).id != ident){
			i++;
		}

		System.out.println("Removendo o item " +ident+ " do carrinho de compras.");
		item.remove(item.get(i));
		totalItens--;

		return item;
	}

	@Override
	public ArrayList<Item> alteraItem(String valor, String data, String marca, String obs, String ident){
		int i = 0;

		while(item.get(i).id != ident){
			i++;
		}

		System.out.println("Alterando o item " +ident+ " do carrinho de compras.");
		item.get(i).preco = valor;
		item.get(i).dataEntrega = data;
		item.get(i).marca = marca;
		item.get(i).especificacao = obs;

		return item;
	}
}
