package escola;

public class Pessoa{
    private String nome = "";
    private String email = "";
    
    public Pessoa(){
    	System.out.println("Informe o nome:");
    	String n = Escola.scan.nextLine();
    	System.out.println("Informe o email:");
    	String e = Escola.scan.nextLine();
        this.nome = n;
        this.email = e;
    }


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
        System.out.println("Nome: "+this.nome + " \nEmail: "+this.email);
    }





}
