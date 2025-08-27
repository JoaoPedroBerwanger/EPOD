package Aula5;

public class Pessoa implements Comparable<Pessoa> {

	private Integer id;
	private String nome;
	
	public Pessoa(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return id + ": " + nome;
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.id.compareTo(outraPessoa.id);
	}
}

