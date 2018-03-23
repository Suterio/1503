package escola;

public class Aluno extends Pessoa{
    private long matricula;
    
    public long getMatricula(){
            return this.matricula;
    }
    public void setMatricula(long novaMatricula){
            matricula = novaMatricula;
    }

    public Aluno(String nome,String email, long matricula){
        super(nome,email);
        this.matricula = matricula;
    }        
    public void mostraDados(){
        super.mostraDados();
        System.out.println("Dados da Matrícula: ");        
        System.out.println("Matrícula: "+this.matricula);
    }
}

