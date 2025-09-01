package Atividade;

public class Livro implements Comparable<Livro> {
	
	public String titulo;
	public String autor;
	public Integer anoDePublicacao;
	public Double notaDeAvaliacao;
	public Double preco;
	
	public Livro(String titulo, String autor, Integer anoDePublicacao, Double notaDeAvaliacao, Double preco) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.notaDeAvaliacao = notaDeAvaliacao;
		this.preco = preco;
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public Double getNotaDeAvaliacao() {
		return notaDeAvaliacao;
	}

	public Double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return titulo  + " (" + autor + ")" + " - " + anoDePublicacao;
	}

	@Override
	public int compareTo(Livro outroLivro) {
		return this.titulo.compareTo(outroLivro.titulo);
	}
}
