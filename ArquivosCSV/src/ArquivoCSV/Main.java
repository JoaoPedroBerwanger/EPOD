package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Main {
		
	public static void main(String[] args) {
	
		List<Paciente> pacientes = LeitorCSV.lerArquivo("src/inputs/pacientes.csv");
		
		PriorityQueue<Paciente> fila = new PriorityQueue<>(pacientes);

		while (!fila.isEmpty()) {
		    System.out.println(fila.poll());
		}
        
	}
}
