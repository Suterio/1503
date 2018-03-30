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
}
