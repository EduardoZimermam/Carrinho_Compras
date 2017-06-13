/**
  * @author Eduardo Zimermam Pereira
  *
  */

import java.util.ArrayList;

interface CarrinhoComprasCommand{
	public ArrayList<Item> incluiItem(ArrayList<Item> lista, String valor, String data, String marca, String obs, String ident);
    public ArrayList<Item> excluiItem(ArrayList<Item> lista, String ident);
 	public ArrayList<Item> alteraItem(ArrayList<Item> lista, String valor, String data, String marca, String obs, String ident);
}