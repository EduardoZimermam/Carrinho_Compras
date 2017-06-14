/**
  * @author Eduardo Zimermam Pereira
  *
  */

class Usuario{
	String nome,
	       email,								
 	       id_U;

 	private static Usuario user;

	public static Usuario getInstanceUsuario(String name, String e_mail, String id){
		
		if (user == null){								
			user = new Usuario();
			System.out.println("Criando usuário do carrinho de compras: " +id);				/** Método get para instanciar o usuário do carrinho de compras **/
			user.nome = name;
			user.email = e_mail;
			user.id_U = id;
		}

		return user;
	}
}
