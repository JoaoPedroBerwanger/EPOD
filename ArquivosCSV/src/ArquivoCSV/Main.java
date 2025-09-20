package ArquivoCSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void exibirContas(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println(conta.toString());
		}
	}
	public static void main(String[] args) {
	
		List<Conta> contas = LeitorCSV.lerArquivo("src/inputs/contas.csv");
		
		Collections.sort(contas);
		exibirContas(contas);
		
		Comparator<Conta> comparadorSaldo = Comparator.comparing(Conta::getSaldo);
		
		System.out.println("Maior elemento: " + Collections.max(contas, comparadorSaldo));
		System.out.println("Menor elemento: " + Collections.min(contas, comparadorSaldo));
		
		int index = Collections.binarySearch(contas, new Conta("936693710", null, null, null));
		
		if(index > 0)
			System.out.println("Conta encontrada " + contas.get(index));
		else
			System.out.println("Conta não encontrada");			
	}
}
