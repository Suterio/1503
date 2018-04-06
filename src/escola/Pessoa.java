package escola;

public class Pessoa{
    private String nome = "";
    private String email = "";
    private int indice;
    
    public Pessoa(){
    	System.out.println("Informe o nome:");
    	String n = Escola.scan.nextLine();
    	System.out.println("Informe o email:");
    	String e = Escola.scan.nextLine();
        this.nome = n;
        this.email = e;
    }
    
    public int getIndice() {
		return indice;
    }
    public void setIndice(int indice) {
		this.indice = indice;
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
    public void dataUpdate() {
    	String nome = "";
    	String email = "";
    	System.out.println("Digite o novo nome: ");
    	nome = Escola.scan.nextLine();
    	if(!nome.isEmpty()) {
    		this.nome = nome;
    	}
    	System.out.println("Digite o novo e-mail: ");
    	email = Escola.scan.nextLine();
    	if(!email.isEmpty()) {
    		this.email = email;
    	}
    }

    
    
    public void mostraDados(){
        System.out.println("Dados Cadastrais: ");
        System.out.println("Nome: "+this.nome + " \nEmail: "+this.email);
    }





}
