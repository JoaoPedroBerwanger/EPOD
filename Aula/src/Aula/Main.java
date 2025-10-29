package Aula;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		
		Queue<Tarefa> filaPrioridade = new PriorityQueue<Tarefa>(Collections.reverseOrder());
		
		filaPrioridade.add(new Tarefa(1, "funcionalidade 10", Prioridade.BAIXA));
		filaPrioridade.add(new Tarefa(5, "funcionalidade 15", Prioridade.ALTA));
		filaPrioridade.add(new Tarefa(16, "funcionalidade 2", Prioridade.ALTA));
		filaPrioridade.add(new Tarefa(8, "funcionalidade 25", Prioridade.MEDIA));
		
		System.out.println(filaPrioridade);
	} 
}
