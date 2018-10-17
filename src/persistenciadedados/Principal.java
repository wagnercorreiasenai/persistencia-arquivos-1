package persistenciadedados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {       
        //Instâncias e declarações
        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> listaDeClientes = new ArrayList();
        String aux = "";
        
        //Loop do menu do programa
        while(!aux.equals("sair")) {
            //Pergunta para o usuário
            System.out.println("Deseja cadastrar "
                    + "um novo cliente? (sim/sair)");
            aux = scan.nextLine();
            
            //Começa a solicitar os dados do cliente
            if (aux.equals("sim")) {
                Cliente objCliente = new Cliente();
                
                System.out.println("Nome do cliente:");
                objCliente.nome = scan.nextLine();
                
                System.out.println("Cidade do cliente:");
                objCliente.cidade = scan.nextLine();
                
                System.out.println("Data de nascimento "
                        + "(dd/mm/aaaa):");
                objCliente.nascimento = scan.nextLine();
                
                //Adiciona os cliente na ArrayList
                listaDeClientes.add(objCliente);
                
            }
            
        }
        
        GerenciaDeDados.salvar(listaDeClientes);
        
    }
    
}