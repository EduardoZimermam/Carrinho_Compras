/**
  * @author Eduardo Zimermam Pereira
  *
  */


public abstract class UserAbstract{
	String nome,
		   email,								/** Classe abstrata que define o Usuário. Padrão Abstract Factory.**/
		   id_U;



	abstract User criaUser(String nome, String email, String id);
}