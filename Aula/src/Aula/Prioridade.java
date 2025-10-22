package Aula;

public enum Prioridade {
	ALTA(3),
	MEDIA(2),
	BAIXA(1);
	
	private final Integer valor;
	
	Prioridade(int valor){
		this.valor = valor;
	}

	public Integer getValor() {
		return valor;
	}
}
