package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
	
	public static List<Participante> lerArquivo(String caminhoArq) {
        List<Participante> participantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Participante participante = new Participante(
                		Integer.parseInt(campos[0]), 
                		campos[1] 
                		);
                
                participantes.add(participante);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return participantes;
    }
}
