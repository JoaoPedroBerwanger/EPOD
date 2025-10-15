package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
		
	public static void main(String[] args) {
	
		List<Participante> participantes = LeitorCSV.lerArquivo("src/inputs/eventos.csv");
		
		Set<Participante> eventoA = new TreeSet<>();
		Set<Participante> eventoB = new TreeSet<>();
		Set<Participante> eventoC = new TreeSet<>();

		String caminho = "src/inputs/eventos.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Integer numero = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String evento = campos[2];
                
                Participante p = new Participante(numero, nome);
                
                switch (evento.toLowerCase()) {
                	case "eventoa":
                		eventoA.add(p);
                		break;
                	case "eventob":
                		eventoB.add(p);
                		break;
                	case "eventoc":
                		eventoC.add(p);
                		break;
				}
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
		
		Set<Participante> todosOrdenadosPorNome = new TreeSet<>(Comparator.comparing(Participante::getNome));
        
		todosOrdenadosPorNome.addAll(eventoA);
        todosOrdenadosPorNome.addAll(eventoB);
        todosOrdenadosPorNome.addAll(eventoC);

        System.out.println("Participantes ordenados por nome:");
        todosOrdenadosPorNome.forEach(System.out::println);
        System.out.println();

        Set<Participante> EventoAeEventoB = new TreeSet<>(eventoA);
        EventoAeEventoB.retainAll(eventoB); 
        
        System.out.println("Participantes que participaram do evento A e também do evento B:");
        EventoAeEventoB.forEach(System.out::println);
        System.out.println();

        Set<Participante> NaoForamC = new TreeSet<>(eventoA);
        NaoForamC.addAll(eventoB);
        NaoForamC.removeAll(eventoC); 
        
        System.out.println("Participantes que não participaram do evento C:");
        NaoForamC.forEach(System.out::println);
        
	}
}
