package ArquivoCSV;

import java.util.Objects;

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
		return this.numero.compareTo(p.numero);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(numero, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participante other = (Participante) obj; 
		return Objects.equals(numero, other.getNumero()) && Objects.equals(nome, other.getNome());
	}


	@Override
	public String toString() {
		return nome + " (Registro: " + numero + ")";
	}
}
