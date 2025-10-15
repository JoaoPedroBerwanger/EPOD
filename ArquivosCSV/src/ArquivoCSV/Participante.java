package ArquivoCSV;

public class Participante implements Comparable<Participante> {
	private Integer numero;
	private String nome;

	public Participante(Integer numero, String nome) {

		this.numero = numero;
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(Participante p) {
		return 0;
	}
}