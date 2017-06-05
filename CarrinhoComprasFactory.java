/**
  * @author Eduardo Zimermam Pereira
  *
  */

public abstract class CarrinhoComprasFactory{

    	public abstract ArrayList<Item> incluiItem(ArrayList<Item>, String, String, String, String, String);
    	public abstract ArrayList<Item> excluiItem(ArrayList<Item>, String);
    	public abstract ArrayList<Item> alteraItem(ArrayList<Item>, String, String, String, String, String);
}
