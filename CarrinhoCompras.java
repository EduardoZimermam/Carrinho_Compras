/**
  * @author Eduardo Zimermam Pereira
  *
  */

public class CarrinhoCompras{
	Usuario user = Usuario.getInstanceUsuario();
	static int totalItens;

	public static Item getInstanceItem(){
		Item item = new Item();

		totalItens++;

		return item;
	}
}
