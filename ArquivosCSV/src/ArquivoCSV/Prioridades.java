package ArquivoCSV;

public enum Prioridades {

	EMERGENCIA(1),
	URGENTE(2),
	PREFERENCIAL(3),
	COMUM(4);
	
	public final Integer id;
	
	Prioridades(Integer id){
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
    public static Prioridades fromString(String texto) {
        return Prioridades.valueOf(texto.trim().toUpperCase());
    }
}
