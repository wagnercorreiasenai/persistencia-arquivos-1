package persistenciadedados;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        
        //Instâncias e declarações
        Scanner scan = new Scanner(System.in);
        String aux = "";
        InteracaoUsuario intUsu = new InteracaoUsuario();

        //Loop do menu do programa
        while(!aux.equals("sair")) {
            System.out.println("Selecione uma opção:");
            System.out.println("cadastrar | listar | atualizar | sair");
            aux = scan.nextLine();
            
            if (aux.equals("cadastrar")) {
                intUsu.cadastrarClientes();
            } else if (aux.equals("listar")) {
                intUsu.listarClientes();
            }
            
        }
                
    }

}
