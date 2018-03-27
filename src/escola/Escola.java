package escola;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

import javax.xml.ws.handler.MessageContext.Scope;


public class Escola{
    public static void main (String args[]){
    
/*        Pessoa p = new Pessoa(args[0],args[1]);
        p.mostraDados();
        
        Aluno a = new Aluno(args[0],args[1],Long.parseLong(args[2]));
        a.mostraDados();
        
        Professor prof = new Professor(args[0],args[1],args[3],Integer.parseInt(args[4]));
        prof.mostraDados();  */
    	
    	testArrayList();
    	//testaConsole();
    	//testaScanner();
    	
    }
    
    public static void testaConsole() {
		
    	Console cons = System.console();
    	if(cons==null) {
    		System.out.println("Console Inacessível");
    		System.exit(1);
    	
    	}
    	String valor = cons.readLine("Informe um valor: ");
    	System.out.println("Você informou: "+valor);
    	
	}
    
    public static void testaScanner() {
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Informe um valor String");
    	String valor = scan.next();
    	System.out.println("Você informou: "+valor);
    	
    	System.out.println("Informe a sua idade");
    	int idade = scan.nextInt();    	
    	System.out.println("Idade: "+idade);
    	scan.nextLine();
    	System.out.println("Informe seu nome completo");
    	String nome = scan.nextLine();
    	System.out.println("Nome Completo: "+nome);
    	
		
	}
    public static void Menu() {
    	System.out.println("MENU:");
    	System.out.println("Cadastro de Alunos");
    	System.out.println("Cadastro de Professores");
    	
    }
    
    public static void testArrayList(){
    	ArrayList<String> listaAlunos = new ArrayList<String>();
    	ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    	listaAlunos.add("José");
    	listaAlunos.add("Luis");
    	listaAlunos.add("Tiago");
    	listaAlunos.add("Pedro");
    	listaAlunos.add("Henrique");
    	listaAlunos.add("João");
    	listaAlunos.add("Pietro");
    	listaAlunos.add("Camila");
    	listaAlunos.add("Igor");
    	listaAlunos.add("Leonardo");
    	listaNotas.add(1);
    	listaNotas.add(2);
    	listaNotas.add(3);
    	listaNotas.add(4);
    	listaNotas.add(5);
    	listaNotas.add(6);
    	listaNotas.add(7);
    	listaNotas.add(8);
    	listaNotas.add(9);
    	listaNotas.add(10);
    	for (Integer nota : listaNotas) {
    		System.out.println("Nome do Aluno: " + listaAlunos.get(listaNotas.indexOf(nota)));
    		if (nota >= 7) {
				System.out.println("Passou no Trimestre!");
    		} else
				System.out.println("Não passou no Trimestre!");
    		
    	}	
    		
		
    }



}
