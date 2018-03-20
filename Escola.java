public class Escola{
    public static void main (String args[]){
    
        Pessoa p = new Pessoa(args[0],args[1]);
        p.mostraDados();
        
        Aluno a = new Aluno(args[0],args[1],Long.parseLong(args[2]));
        a.mostraDados();
        
        Professor prof = new Professor(args[0],args[1],args[3],Integer.parseInt(args[4]));
        prof.mostraDados();    
    }
    
    public static void testArrayList(){
        
    }



}
