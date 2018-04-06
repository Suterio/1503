package escola;

public class Professor extends Pessoa{
    private String disciplina;
    private int cargaHoraria;

    public Professor(){
        super();
        System.out.println("Informe a disciplina:");
        String dis = Escola.scan.nextLine();
        System.out.println("Informe a Carga Horaria:");
        int ch = Escola.scan.nextInt();
        Escola.scan.nextLine();
        this.disciplina = dis ;
        this.cargaHoraria = ch;
    }
    
    
    public String getDisciplina(){
            return this.disciplina;
    }
    public void setDiscilpina(String novaDisciplina){
            disciplina = novaDisciplina;
    }
    public int getCargaHoraria(){
            return this.cargaHoraria;
    }
    public void setCargaHoraria(int novaCargaHoraria){
            cargaHoraria = novaCargaHoraria;
    }

    



    public void mostraDados(){
        super.mostraDados();
        System.out.println("Dados do Professor: ");
        System.out.println("Disciplina: " +this.disciplina);
        System.out.println("Carga Horária: " +this.cargaHoraria);
        
    
    }
    public void dataUpdateProf() {
    	super.dataUpdate();
    	int matric = 0;
    	System.out.println("Informe a nova Matricula(Digite 0 para não alterar): ");
    	matric = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	if(matric != 0) {
    		this.matricula = matric;
    	}
    }
    public void save() {
    	Escola.listaProf.add(this);
    	
    }
    public void update() {
    	Escola.listaProf.set(this.getIndice(), this);
    }

}
