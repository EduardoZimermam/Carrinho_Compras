import java.util.ArrayList;

public class Teste{
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();
		ArrayList <Item> itens = new ArrayList <Item>();

		carrinho.user.nome = "João";

		System.out.println(carrinho.user.nome);

		carrinho.incluiItem(itens, "49,99", "25/05/2017", "LG", "Fone", "I1");
		carrinho.incluiItem(itens, "149,99", "25/05/2017", "Levi's", "Calça", "I2");

		System.out.println(itens.get(0).preco);
		System.out.println(itens.get(0).dataEntrega);
		System.out.println(itens.get(0).marca);
		System.out.println(itens.get(0).especificacao);
		System.out.println(itens.get(0).id);
		System.out.println(itens.get(1).preco);
		System.out.println(itens.get(1).dataEntrega);
		System.out.println(itens.get(1).marca);
		System.out.println(itens.get(1).especificacao);
		System.out.println(itens.get(1).id);
	}
}