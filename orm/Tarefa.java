package orm;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tarefas")
public class Tarefa {
	
	@Id
	@GeneratedValue
	private Long id;
	private String descricao;
	private boolean finalizado;
	
	@Temporal(TemporalType.DATE)
	private Calendar dataDeFinalizacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataDeFinalizacao() {
		return dataDeFinalizacao;
	}
	public void setDataDeFinalizacao(Calendar dataDeFinalizacao) {
		this.dataDeFinalizacao = dataDeFinalizacao;
	}
	
	
}
