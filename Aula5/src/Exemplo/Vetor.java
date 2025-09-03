package Exemplo;

import java.util.Arrays;
import java.util.Random;

public class Vetor {
	private int[] dados;
	
	public Vetor(int tamanho) {
		dados = new int[tamanho];
	}
	
	public int[] getDados() {
		return dados;
	}
	
	public void inicializarCrescente() {
		for (int i = 0; i < dados.length; i++) {
			dados[i] = i + 1;
		}
	}
	
	public void inicializarDecrescente() {
		for (int i = 0; i < dados.length; i++) {
			dados[i] = dados.length - i;
		}
	}
	
	public void inicializarRandom() {
		Random rand = new Random();
		for (int i = 0; i < dados.length; i++) {
			dados[i] = rand.nextInt(100);
		}
	}

	public void exibirDados() {
		System.out.println(Arrays.toString(dados));
	}
}