package escola;

public class Pessoa{
    private String nome = "";
    private String email = "";

    public String getNome(){
            return this.nome;
    }
    public void setNome(String novoNome){
            nome = novoNome;
    }
    public String getEmail(){
            return this.email;
    }
    public void setEmail(String novoEmail){
            email = novoEmail;
    
    }
    public void mostraDados(){
        System.out.println("Dados Cadastrais: ");
        System.out.println("Nome: "+this.nome + " Email: "+this.email);
    }


    public Pessoa(String n, String e){
        this.nome = n;
        this.email = e;
    }



}
