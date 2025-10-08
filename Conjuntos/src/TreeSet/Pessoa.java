package TreeSet;

public class Pessoa implements Comparable<Pessoa> {

	String nome;
	Integer idade;
	
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void getIdade(Integer idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return nome + ',' + idade;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(nome);
	}
	
}
