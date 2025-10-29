package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
	
	public static List<Paciente> lerArquivo(String caminhoArq) {
        List<Paciente> pacientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Paciente paciente = new Paciente(
                		Integer.parseInt(campos[0]), 
                		campos[1],
                		Prioridades.fromString(campos[2])
                		);
                
                pacientes.add(paciente);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return pacientes;
    }
}
