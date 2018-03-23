package escola;

import java.util.ArrayList;


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
    	ArrayList<String> listaAlunos = new ArrayList<String>();
    	ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    	listaAlunos.add("José");
    	listaAlunos.add("Luis");
    	listaAlunos.add("Thiago");
    	listaAlunos.add("Pedro");
    	listaAlunos.add("Henrique");
    	listaAlunos.add("João");
    	listaAlunos.add("Pietro");
    	listaNotas.add(6);
    	listaNotas.add(8);
    	listaNotas.add(9);
    	listaNotas.add(5);
    	listaNotas.add(7);
    	listaNotas.add(4);
    	listaNotas.add(10);
    	for (Integer nota : listaNotas) {
    		if (nota >= 7) {
				System.out.println("Passou no Trimestre!");
    		} 
				System.out.println("Não passou no Trimestre!");
    		
    	}	
    		
		
    }



}
