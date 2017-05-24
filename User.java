/**
  * @author Eduardo Zimermam Pereira
  *
  */


public class User extends UserAbstract{

	public static User criaUser(String nome, String email, String id){
		User user = new User();

		user.nome = nome;
		user.email = email;
		user.id_U = id;

		return user;
	}
	
}