import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
	
	public static List<Acao> lerArquivo(String caminhoArq) {
        List<Acao> acao = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Acao acoes = new Acao(
                		campos[0], 
                		campos[1] 
                		);
                
                acao.add(acoes);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return acao;
    }
}
