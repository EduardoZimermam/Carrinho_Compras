/**
  * @author Eduardo Zimermam Pereira
  *
  */

import java.util.ArrayList;

interface CarrinhoComprasCommand{
	public ArrayList<Item> incluiItem(String valor, String data, String marca, String obs, String ident);
    public ArrayList<Item> excluiItem(String ident);
 	public ArrayList<Item> alteraItem(String valor, String data, String marca, String obs, String ident);
}