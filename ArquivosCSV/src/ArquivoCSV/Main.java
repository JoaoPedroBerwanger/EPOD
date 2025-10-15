package ArquivoCSV;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main {

	@SuppressWarnings("unchecked")
	public static void exibeAcoes(List<Acao> acoes) {

		Stack<String> pilhaAcoes = new Stack<>();
		Queue<String> acoesDesfeitas = new LinkedList<>();

		for (Acao acao : acoes) {

			if (acao.getOperacao().equals("Feito"))
			{
				pilhaAcoes.push(acao.getAcao());
			}
			else if (acao.getOperacao().equals("Desfeito"))
			{
				if (!pilhaAcoes.isEmpty()) 
				{
					String ultima = pilhaAcoes.pop();
					acoesDesfeitas.add(ultima);
				}
			}
		}

        System.out.println("Ações realizadas:");
        for (String acao : pilhaAcoes) {
            System.out.println(acao);
        }
        System.out.println();

        System.out.println("Ações desfeitas:");
        for (String acao : acoesDesfeitas) {
            System.out.println(acao);
        }
        System.out.println();

        System.out.println("Ações recentes:");
        Stack<String> pilhaExcluir = (Stack<String>) pilhaAcoes.clone();
        
        while (!pilhaExcluir.isEmpty())
            System.out.println(pilhaExcluir.pop());
	}
		
	public static void main(String[] args) {
	
		List<Acao> acao = LeitorCSV.lerArquivo("src/inputs/editor.csv");		
		exibeAcoes(acao);
	
	}
}
