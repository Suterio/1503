public class Professor extends Pessoa{
    private String disciplina;
    private int cargaHoraria;

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

    
    public Professor(String nome, String email, String disc, int carga){
        super(nome,email);
        this.disciplina = disc ;
        this.cargaHoraria = carga;
    }


    public void mostraDados(){
        super.mostraDados();
        System.out.println("Dados do Professor: ");
        System.out.println("Disciplina: " +this.disciplina);
        System.out.println("Carga Horária: " +this.cargaHoraria);
        
    
    }
}
