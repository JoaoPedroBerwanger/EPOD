package ArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {
	
	public static List<Conta> lerArquivo(String caminhoArq) {
        List<Conta> contas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArq))) {
            String linha;
            
            // Pular a primeira linha (cabeçalho)
            br.readLine();
            
            // Lendo os registros
            while ((linha = br.readLine()) != null) {
                String[] campos = linha.split(",");
                Conta conta = new Conta(campos[0], campos[1], campos[2], Double.parseDouble(campos[3]));
                contas.add(conta);
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        return contas;
    }
}
