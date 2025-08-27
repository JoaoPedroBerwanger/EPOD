package Aula5;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		
		Pessoa[] pessoas = {	
			new Pessoa(1, "João"),
			new Pessoa(3, "Carlos"),
			new Pessoa(9, "Fabio"),
			new Pessoa(5, "João")
		};
		
		System.out.println(Arrays.toString(pessoas));
		
		Arrays.sort(pessoas);
		System.out.println(Arrays.toString(pessoas));
		
		Arrays.sort(pessoas, (p1, p2) -> p1.getNome().compareTo(p2.getNome()));
		System.out.println(Arrays.toString(pessoas));
	}

}
