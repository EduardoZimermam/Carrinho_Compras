public class Teste{
	public static void main(String[] args) {
		CarrinhoCompras carrinho = new CarrinhoCompras();

		carrinho.user.nome = "João";

		System.out.println(carrinho.user.nome);

		Item i1 = CarrinhoCompras.getInstanceItem();

		i1.preco = "1,00";

		System.out.println(i1.preco);		

	}
}