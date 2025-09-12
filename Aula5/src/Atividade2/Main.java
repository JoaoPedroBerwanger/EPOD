package Atividade2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Produto[] estoque = { 
				new Produto("Cadeira", 4), 
				new Produto("Celular", 0), 
				new Produto("Impressora", 2),
				new Produto("Notebook", 5), 
				new Produto("Tablet", 3) };

		String[] pedidos = { "Notebook", "Celular", "Tablet", "Cadeira", "Notebook", "TV", "Impressora", "TV",
				"Cadeira", "Tablet", "Notebook", "Celular", "Cadeira", "Notebook", "Tablet", "Impressora", "Notebook",
				"Cadeira", "TV", "Celular", "Notebook" };

		for (String pedido : pedidos) {

			Produto chave = new Produto(pedido, 0);
			int posicao = Arrays.binarySearch(estoque, chave);

			if (posicao >= 0) {

				Produto encontrado = estoque[posicao];
				
				if (encontrado.getQuantidade() > 0) {
					encontrado.sell();
					System.out.println(encontrado.getNome() + ", índice " + posicao + ", quantidade " + encontrado.getQuantidade());
				}

				else {
					System.out.println(encontrado.getNome() + ", índice " + posicao + ", indisponível");
				}
			}

			else {
				System.out.println(pedido + ", não encontrado");
			}
		}
	}

}
