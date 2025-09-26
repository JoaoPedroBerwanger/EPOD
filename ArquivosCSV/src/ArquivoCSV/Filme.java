package ArquivoCSV;

import java.util.Objects;

public class Filme implements Comparable<Filme> {
	private String titulo;
	private String diretor;
	private Integer ano;
	private String genero;
	private String classificacao;
	private Integer duracao;
	private Double avaliacao;
	private Double orcamento;
	private Double receita;

	public Filme(String titulo, String diretor, Integer ano, String genero, String classificacao, Integer duracao,
			Double avaliacao, Double orcamento, Double receita) {

		this.titulo = titulo;
		this.diretor = diretor;
		this.ano = ano;
		this.genero = genero;
		this.classificacao = classificacao;
		this.duracao = duracao;
		this.avaliacao = avaliacao;
		this.orcamento = orcamento;
		this.receita = receita;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public Integer getAno() {
		return ano;
	}

	public String getGenero() {
		return genero;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public Integer getDuracao() {
		return duracao;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public Double getReceita() {
		return receita;
	}

	@Override
	public int hashCode() {
		return Objects.hash(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return Objects.equals(titulo, other.getTitulo());
	}

	@Override
	public int compareTo(Filme outroFilme) {
		return this.titulo.compareTo(outroFilme.getTitulo());
	}

	@Override
	public String toString() {
		return titulo + ", " + diretor + ", " + ano + ", " + genero + ", " + classificacao + ", " + duracao + ", "
				+ avaliacao + ", " + orcamento + ", " + receita;
	}
}