package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
	
	public static List<Filme> lerArquivo(String caminhoArq) {
        List<Filme> filmes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Filme filme = new Filme(
                		campos[0], 
                		campos[1], 
                		Integer.parseInt(campos[2]), 
                		campos[3], 
                		campos[4], 
                		Integer.parseInt(campos[5]), 
                		Double.parseDouble(campos[6]), 
                		Double.parseDouble(campos[7]), 
                		Double.parseDouble(campos[8]));
                
                filmes.add(filme);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return filmes;
    }
}
