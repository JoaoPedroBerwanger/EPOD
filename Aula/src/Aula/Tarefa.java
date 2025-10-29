package Aula;

public class Tarefa implements Comparable<Tarefa>{
	private Integer id;
	private String descricao;
	private Prioridade prioridade;
	
	public Tarefa(Integer id, String descricao, Prioridade prioridade) {
		this.id = id;
		this.descricao = descricao;
		this.prioridade = prioridade;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	@Override
	public String toString() {
		return id + ", " + descricao + ", " + prioridade + " |";
	}

	@Override
	public int compareTo(Tarefa outra) {
		int comparacao = prioridade.getValor().compareTo(outra.prioridade.getValor());
		if (comparacao == 0)
			return id.compareTo(outra.id);
		return comparacao;
	}
	
}
