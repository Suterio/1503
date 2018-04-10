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
    	String dicip;
    	int cargahora = 0;
    	System.out.println("Informe a nova Disciplina: ");
    	dicip = Escola.scan.nextLine();
    	if(!dicip.isEmpty()) {
    		this.disciplina = dicip;
    	}
    	System.out.println("Informe nova carga Horária(Digite 0 para não alterar)");
    	cargahora = Escola.scan.nextInt();
    	Escola.scan.nextLine();
    	if(cargahora != 0) {
    		this.cargaHoraria = cargahora;
    	}
    }
    public boolean save() {
    	Escola.listaProf.add(this);
    	return true;
    }
    public void update() {
    	Escola.listaProf.set(this.getIndice(), this);
    }

}
