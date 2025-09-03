package Exemplo;

public abstract class AlgOrdenacao {

   /**
    * Método que implementa o algoritmo Insertion Sort.
    * Ordena um vetor de inteiros em ordem crescente.
    *
    * @param vet - vetor de inteiros
    */
    public static void insertionSort(int[] vet) {
        for (int i = 1; i < vet.length; ++i) {
            int chave = vet[i];
            int j = i - 1;

            // Move os elementos de vet[0 .. i - 1] que são maiores que a chave para frente
            while (j >= 0 && vet[j] > chave) {
                vet[j + 1] = vet[j];
                j = j - 1;
            }
            vet[j + 1] = chave;
        }
    }
	    
    /**
     * Método que implementa o algoritmo Selection Sort.
     * Ordena o vetor em ordem crescente.
     * 
     * @param vet - vetor de inteiros
     */
     public static void selectionSort(int[] vet) {
         for (int i = 0; i < vet.length - 1; i++) {
             int indice = i;
             
             // Busca o menor elemento na parte não ordenada do vetor
             for (int j = i + 1; j < vet.length; j++) {
                 if (vet[j] < vet[indice]) {
                     indice = j;
                 }
             }
             // Se encontrou um valor menor, faz a troca com a posição atual
             if (vet[i] > vet[indice]) {
                 int aux = vet[indice];
                 vet[indice] = vet[i];
                 vet[i] = aux;
             }
         }
     }
}
