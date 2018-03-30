package escola;

public class Aluno extends Pessoa{
    private long matricula;
    
    public long getMatricula(){
            return this.matricula;
    }
    public void setMatricula(long novaMatricula){
            matricula = novaMatricula;
    }

    public Aluno(){
    	
        super();
        System.out.println("Informe a matricula: ");
    	int mat = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	this.matricula = mat;
    	
    }        
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Dados da Matrícula: ");        
        System.out.println("Matrícula: "+this.matricula);
    }
}

