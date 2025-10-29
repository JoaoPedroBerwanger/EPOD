package ArquivoCSV;

public class Paciente implements Comparable<Paciente>{
	
	public Integer id;
	public String nome;
	public Prioridades prioridade;
	
	public Paciente(Integer id, String nome, Prioridades prioridade) {
		this.id = id;
		this.nome = nome;
		this.prioridade = prioridade;
	}

	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Prioridades getPrioridade() {
		return prioridade;
	}

	@Override
	public int compareTo(Paciente outro) {
        
		Integer comparacao = Integer.compare(this.prioridade.getId(), outro.prioridade.getId());
        
		if (comparacao == 0) {
            return Integer.compare(outro.id, this.id);
        }
        
        return comparacao;
	}

    @Override
    public String toString() {
        return prioridade.name() + " - " + nome + "(" + id + ")";
    }
}
