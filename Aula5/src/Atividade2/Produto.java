package Atividade2;

public class Produto implements Comparable<Produto> {

	String nome;
	Integer quantidade;
	
	public Produto(String nome, Integer quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void sell() {
		if(quantidade > 0)
			quantidade--;
	}
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produto produto = (Produto) obj;
        return nome.equals(produto.nome);
	}
	
	@Override
    public int compareTo(Produto outro) {
            return this.nome.compareTo(outro.nome);
    }
}
