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

    public void dataUpdateAluno() {
    	super.dataUpdate();
    	int matric = 0;
    	System.out.println("Informe a nova Matricula(Digite 0 para não alterar): ");
    	matric = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	if(matric != 0) {
    		this.matricula = matric;
    	}
    }
    
    public boolean save() {
    	Escola.listaAlunos.add(this);
    	return true;
    }
    public void update() {
    	Escola.listaAlunos.set(this.getIndice(), this);
    }


}

