package view_testes;

import java.sql.SQLException;

import model.Contato;
import regrasdenegocio.ContatoDao;

public class TesteDaoInsere {
	public static void main(String[] args) {

		try {
			Contato contato = new Contato();
			contato.setNome("Claudia");
			contato.setEmail("claudia@gmail.com");
			contato.setEndereco("Av Brasil, 3000");
			
			ContatoDao dao = new ContatoDao();
			dao.adiciona(contato);
			
			System.out.println("Contato gravado com sucesso!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
