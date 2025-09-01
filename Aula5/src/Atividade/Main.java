package Atividade;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    	
        Livro[] livros = {
            new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 4.9, 50.0),
            new Livro("1984", "George Orwell", 1949, 4.8, 30.0),
            new Livro("Duna", "Frank Herbert", 1965, 4.7, 45.0),
            new Livro("Neuromancer", "William Gibson", 1984, 4.5, 40.0),
            new Livro("Fahrenheit 451", "Ray Bradbury", 1953, 4.6, 35.0)
        };

       Arrays.sort(livros);
       System.out.println("Ordenados por título (ordem crescente):"); 
       for (Livro livro : livros) {
    	   System.out.println(livro);
       }
       
       System.out.println();
       
       Arrays.sort(livros, (l1, l2) -> l1.getAnoDePublicacao().compareTo(l2.getAnoDePublicacao()));
       System.out.println("Ordenados por ano de publicação (ordem crescente):"); 
       for (Livro livro : livros) {
    	   System.out.println(livro);
       }
       
       System.out.println();

       Arrays.sort(livros, (l1, l2) -> l2.getAutor().compareTo(l1.getAutor()));
       System.out.println("Ordenados por autor (ordem decrescente):"); 
       for (Livro livro : livros) {
    	   System.out.println(livro);
       }
       
       System.out.println();

       Arrays.sort(livros, (l1, l2) -> l1.getPreco().compareTo(l2.getPreco()));
       System.out.println("Ordenados por custo-benefício (ordem crescente):"); 
       for (Livro livro : livros) {
    	   System.out.println(livro);
       }
    }
 }
