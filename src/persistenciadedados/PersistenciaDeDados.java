package persistenciadedados;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PersistenciaDeDados {

    public static void main(String[] args) throws IOException {
       
        FileWriter arquivoTxt = new FileWriter("C:/Users/Suporte/Documents/NetBeansProjects/aula_java.txt");
        PrintWriter gravarArq = new PrintWriter(arquivoTxt);
        
        gravarArq.println("Persistência de dados");
        gravarArq.println("16/10/2018");
        
        arquivoTxt.close();
        
    }
    
}