package persistenciadedados;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileReader arquivoTxt = new FileReader("C:\\Users\\Suporte\\Documents\\NetBeansProjects\\aula_java.txt");
        BufferedReader lerArq = new BufferedReader(arquivoTxt);
        
        String linha = lerArq.readLine();
        while (linha != null) {
            System.out.println(linha);
            linha = lerArq.readLine();
        }
        
    }
    
}