package orm;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeradorDeTarefas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		factory.close();
		System.out.println("Tabela tarefa inserida com sucesso!");
	}
}
