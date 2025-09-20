package Exemplo;

/*
 * Com base no código implementado neste projeto, execute os seguintes casos:
 * 
 * Insertion Sort com:
 * 1) inicialização crescente
 * 2) inicialização decrescente
 * 3) inicialização randômica
 * 
 * Selection Sort com:
 * 1) inicialização crescente
 * 2) inicialização decrescente
 * 3) inicialização randômica
 * 
 * Calcule o tempo de execução para vetores com 1.000, 10.000 e 100.000 elementos.
 */

public class Main {
	
	private static final int tamanho = 1000000;
	
	public static void main(String[] args) {
		
		Vetor vet = new Vetor(tamanho);
		vet.inicializarCrescente();	
		
		int retorno = AlgBusca.buscaLinear(vet.getDados(), vet.getDados()[vet.getDados().length - 1]);
		
		long inicio = System.currentTimeMillis();
		
		AlgOrdenacao.selectionSort(vet.getDados());
		
		System.out.println("tempo (ms): " + (System.currentTimeMillis() - inicio));
	}
}

//57