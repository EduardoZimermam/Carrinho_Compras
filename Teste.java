import java.util.ArrayList;

public class Teste{
	public static void main(String[] args) {
		CarrinhoComprasFactory carrinho = new CarrinhoComprasFactory();
		ArrayList <Item> itens = new ArrayList <Item>();

		carrinho.incluiItem(itens, "49,99", "25/05/2017", "LG", "Fone", "I1");
		carrinho.incluiItem(itens, "149,99", "25/05/2017", "Levi's", "Calça", "I2");
		carrinho.incluiItem(itens, "139,99", "25/05/2017", "Bosch", "Bateria moto", "I3");
		int tam = itens.size();

		System.out.println("ESTOU IMPRIMINDO O ARRAY:");

		for(int i = 0; i < tam; i++){
			System.out.println(itens.get(i).id);
			System.out.println(itens.get(i).preco);
			System.out.println(itens.get(i).dataEntrega);
			System.out.println(itens.get(i).marca);
			System.out.println(itens.get(i).especificacao);
		}

		carrinho.excluiItem(itens, "I2");
		System.out.println("\n\n");

		tam = itens.size();

		System.out.println("EXCLUI O ITEM I2:");

		for(int i = 0; i < tam; i++){
			System.out.println(itens.get(i).id);
			System.out.println(itens.get(i).preco);
			System.out.println(itens.get(i).dataEntrega);
			System.out.println(itens.get(i).marca);
			System.out.println(itens.get(i).especificacao);
		}

		System.out.println("\n\n");

		carrinho.alteraItem(itens, "139,99", "25/05/2017", "Bosch", "Bateria moto", "I1");

		System.out.println("ALTEREI O ITEM I1 IGUAL AO I3:");

		for(int i = 0; i < tam; i++){
			System.out.println(itens.get(i).id);
			System.out.println(itens.get(i).preco);
			System.out.println(itens.get(i).dataEntrega);
			System.out.println(itens.get(i).marca);
			System.out.println(itens.get(i).especificacao);
		}
	}
}