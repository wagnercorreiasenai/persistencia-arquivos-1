package persistenciadedados;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InteracaoUsuario {

    public ArrayList<Cliente> listaDeClientes;

    public InteracaoUsuario() {
        GerenciaDeDados.criarPastas();
        this.listaDeClientes = new ArrayList();
    }

    public void cadastrarClientes() throws IOException {
        
        ArrayList<Cliente> listaDeCadastro = new ArrayList();
        
        Scanner scan = new Scanner(System.in);

        //Começa a solicitar os dados do cliente
        Cliente objCliente = new Cliente();

        System.out.println("Nome do cliente:");
        objCliente.nome = scan.nextLine();

        System.out.println("Cidade do cliente:");
        objCliente.cidade = scan.nextLine();

        System.out.println("Data de nascimento "
                + "(dd/mm/aaaa):");
        objCliente.nascimento = scan.nextLine();

        //Adiciona os cliente na ArrayList
        listaDeCadastro.add(objCliente);
        
        GerenciaDeDados.salvar(listaDeCadastro, false);

    }

    public void listarClientes() throws IOException {
        listaDeClientes = GerenciaDeDados.abrirArquivo();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente objCliente = listaDeClientes.get(i);
            System.out.println("Código: "+i+" | Nome: "+objCliente.nome+" | Cidade: "+objCliente.cidade+" | Nascimento: "+objCliente.nascimento);
        }
        
    }
    
    public void editarCliente() throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o código do cliente:");
        int i = scan.nextInt();
        
        listaDeClientes = GerenciaDeDados.abrirArquivo();
        Cliente objCliente = listaDeClientes.get(i);
        
    }

}
