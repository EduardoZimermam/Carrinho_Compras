import java.util.ArrayList;

public class Teste{
	public static void main(String[] args) {
		CarrinhoComprasFactory carrinho = CarrinhoComprasFactory.getInstanceCarrinho("João", "joaozinho@email.com", "U1", "C1");

		carrinho.incluiItem("9,25", "25/05/2017", "Elma Chips", "Salgadinho Fandangos", "P1");
		carrinho.incluiItem("5,95", "25/05/2017", "Bauducco", "Pão de mel", "P2");
		carrinho.incluiItem("7,19", "25/05/2017", "Nestlé", "Farinha Láctea", "P3");

		carrinho.excluiItem("P2");

		carrinho.alteraItem("0,99", "25/05/2017", "Nissin", "Miojo", "P1");

	}
}