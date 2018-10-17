package persistenciadedados;

public class Cliente {
 
    public String nome;
    public String cidade;
    public String nascimento;
    
    public String getPrimeiroNome() {
        String[] arrayNome = this.nome.split(" ");
        return arrayNome[0];
    }
    
}