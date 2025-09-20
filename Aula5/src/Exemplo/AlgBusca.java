package Exemplo;

public abstract class AlgBusca {

	public static int buscaLinear(int[] vetor, int chave) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == chave) {
                return i;
            }
        }
        return -1;
    }
	
	public static int buscaBinaria(int[] vetor, int chave) {
        int inicio = 0, fim = vetor.length - 1;
        
        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;
            
            if (vetor[meio] == chave) {
                return meio;
            } 
            
            if (vetor[meio] < chave) {
                inicio = meio + 1;
            }
            else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
