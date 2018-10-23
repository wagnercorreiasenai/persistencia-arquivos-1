package persistenciadedados;

import java.io.IOException;
import java.util.ArrayList;

public class GerenciaDeDados {

    public static void salvar(ArrayList<Cliente> listaDeClientes) throws IOException {
        //Varre o ArrayList
        String conteudoCsv = "";
        String linha = "";
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente cadastroCliente = listaDeClientes.get(i);
            linha = cadastroCliente.nome + ";"
                    + cadastroCliente.cidade + ";"
                    + cadastroCliente.nascimento;
            conteudoCsv = conteudoCsv + linha + "\n";
        }

        ManipulacaoDeArquivo arquivo
                = new ManipulacaoDeArquivo("C:/Users/Suporte/Documents/NetBeansProjects",
                        "cadastro_de_clientes.csv");
        arquivo.gravar(conteudoCsv);
    }

    public static ArrayList<Cliente> abrirArquivo() throws IOException {
        ManipulacaoDeArquivo arquivo = 
                new ManipulacaoDeArquivo
        ("C:/Users/Suporte/Documents/NetBeansProjects",
                "cadastro_de_clientes.csv");
        
        String[] linhas = arquivo.ler();
        String[] cadastroCliente;
        
        ArrayList<Cliente> listaDeClientes = 
                new ArrayList();
        
        for (int i = 0; i < linhas.length; i++) {
            if (!linhas.equals("")) {
            Cliente objCliente = new Cliente();
            cadastroCliente = linhas[i].split(";");
            
            objCliente.nome = cadastroCliente[0];
            objCliente.cidade = cadastroCliente[1];
            objCliente.nascimento = cadastroCliente[2];
            
            listaDeClientes.add(objCliente);
            }
        }
        
        return listaDeClientes;
    }

}
