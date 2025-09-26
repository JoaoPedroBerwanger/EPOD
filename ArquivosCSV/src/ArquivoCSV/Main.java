package ArquivoCSV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void exibirFilmesApos2003(List<Filme> filmes) {
		for (Filme f : filmes) {
			if(f.getAno() > 2003)
				System.out.println(f.toString());
		}
	}
	
	private static void exibirMelhorFilme(List<Filme> filmes) {
		Comparator<Filme> compararFilme = Comparator.comparing(Filme::getAvaliacao);
		System.out.println(Collections.max(filmes, compararFilme));
	}
	
	private static void exibirPiorFilme(List<Filme> filmes) {
		Comparator<Filme> compararFilme = Comparator.comparing(Filme::getAvaliacao);
		System.out.println(Collections.min(filmes, compararFilme));
	}
	
	public static void exibirFilmesMaiorReceita(List<Filme> filmes) {
		for (Filme f : filmes) {
			if(f.getReceita() >= 10 * f.getOrcamento())
				System.out.println(f.toString());
		}
	}
	
	public static void contabilizaGeneros(List<Filme> filmes) {
		
		List<String> generos = new ArrayList<>();
		
		for (Filme f : filmes) {
			generos.add(f.getGenero());
		}
		
		List<String> generosEmOrdem = new ArrayList<>();
		generosEmOrdem.add("Drama");
		generosEmOrdem.add("Ficção Científica");
		generosEmOrdem.add("Animação");
		generosEmOrdem.add("Guerra");
		generosEmOrdem.add("Ação");
		generosEmOrdem.add("Romance");
		generosEmOrdem.add("Mistério");
		generosEmOrdem.add("Western");
		generosEmOrdem.add("Comédia");
		generosEmOrdem.add("Terror");
		generosEmOrdem.add("Biografia");
		generosEmOrdem.add("Crime");
	    generosEmOrdem.add("Fantasia");
	    generosEmOrdem.add("Suspense");
	    generosEmOrdem.add("Comédia Dramática");
		
		for (String genero : generosEmOrdem) {
			int qtd = Collections.frequency(generos, genero);
			System.out.println(genero + ": " + qtd);
		}
	}
	
	public static void main(String[] args) {
	
		List<Filme> filmes = LeitorCSV.lerArquivo("src/inputs/filmes.csv");
				
		Collections.sort(filmes);
		
		System.out.println("Filmes ordenados por título (produzidos após 2003):");
		exibirFilmesApos2003(filmes);
		System.out.println();
		
		System.out.println("Filme com a maior avaliação:");
		exibirMelhorFilme(filmes);
		System.out.println();
		
		System.out.println("Filme com a menor avaliação:");
		exibirPiorFilme(filmes);
		System.out.println();
		
		System.out.println("Filmes com receita 10 vezes ou mais superior ao orçamento:");
		exibirFilmesMaiorReceita(filmes);
		System.out.println();
		
		System.out.println("Contagem de filmes por gênero:");
		contabilizaGeneros(filmes);
		
		}
}
