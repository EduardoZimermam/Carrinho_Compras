/**
  * @author Eduardo Zimermam Pereira
  *
  */

class Usuario{
	String nome,
	       email,								
 	       id_U;

 	private static Usuario user;

	public static Usuario getInstanceUsuario(){
		
		if (user == null){								/** Método get para instanciar o usuário do carrinho de compras **/
			user = new Usuario();
		}

		return user;
	}
}
