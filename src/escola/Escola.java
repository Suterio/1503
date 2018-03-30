package escola;
import java.io.Console;
import java.util.Scanner;
import java.util.ArrayList;

public class Escola{
	
	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static ArrayList<Professor> listaProf = new ArrayList<Professor>();
	
	public static Scanner scan = new Scanner(System.in);
	
	
    public static void main (String args[]){
    int opMenu = menu();
    switch (opMenu) {
	case 1:
		//menuAlunos();
		System.out.println("Menu 1");
		Aluno al = new Aluno();
		listaAlunos.add(al);
		break;
	case 2:
		//menuProfessores();
		System.out.println("Menu 2");
		Professor pr = new Professor();
		listaProf.add(pr);
		break;

	default:
		System.out.println("Opção invalida");
		System.exit(0);
		break;
		
	}
    }
    
  /*  public static void testaConsole() {
		
    	Console cons = System.console();
    	if(cons==null) {
    		System.out.println("Console Inacessível");
    		System.exit(1);
    	
    	}
    	String valor = cons.readLine("Informe um valor: ");
    	System.out.println("Você informou: "+valor);
    	
	}*/
    
    /*public static void testaScanner() {
    	
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
    	
		
	}*/
    public static int menu() {

    	int opcao = 0;
    	System.out.println("MENU:");
    	System.out.println("Cadastro de Alunos e Cadastro de Professores ");
    	System.out.println("Digite a opção 1 para cadastro de alunos");
    	System.out.println("Digite 2 Para cadastro de Professores");
    	System.out.println("Digite  99 para sair do programa");
    	System.out.print("Digite aqui sua opção: ");
        opcao = Integer.parseInt(scan.nextLine());
        return opcao;
        
/*        if(opcao == 1 ) {
        	Aluno al = new Aluno("Gabriel","gabrielst997@gmail.com",19305);
        }
        else if(opcao == 2) {
        	Prof pr = new Prof("Gabriel","gabrielst997@gmail.com",19305,"Matemática",650);
        	
        }else if(opcao == 99) {
        	System.exit(0);
        }*/
    }
    
    
    /*public static void testArrayList(){
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
    		
		
    }*/



}
