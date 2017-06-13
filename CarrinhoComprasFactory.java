/**
  * @author Eduardo Zimermam Pereira
  *
  */

import java.util.ArrayList;

public class CarrinhoComprasFactory implements CarrinhoComprasCommand{
	Usuario user = Usuario.getInstanceUsuario();
	static int totalItens;

	@Override
	public ArrayList<Item> incluiItem(ArrayList<Item> lista, String valor, String data, String marca, String obs, String ident){
		Item item = new Item();

		item.preco = valor;
		item.dataEntrega = data;
		item.marca = marca;
		item.especificacao = obs;
		item.id = ident;

		lista.add(item);

		return lista;
	}

	@Override
	public ArrayList<Item> excluiItem(ArrayList<Item> lista, String ident){
		int i = 0;

		while(lista.get(i).id != ident){
			System.out.println(lista.get(i).id + ident);
			i++;
		}

		lista.remove(lista.get(i));

		return lista;
	}

	@Override
	public ArrayList<Item> alteraItem(ArrayList<Item> lista, String valor, String data, String marca, String obs, String ident){
		int i = 0;

		while(lista.get(i).id != ident){
			i++;
		}

		lista.get(i).preco = valor;
		lista.get(i).dataEntrega = data;
		lista.get(i).marca = marca;
		lista.get(i).especificacao = obs;

		return(lista);
	}
}
