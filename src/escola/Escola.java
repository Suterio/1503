package escola;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Escola {

	public static ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
	public static int numMenu = 0;
	public static ArrayList<Professor> listaProf = new ArrayList<Professor>();
	public static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		int op = menu();
		while (op != 99) {
			switch (op) {
			case 1:
				int op2 = menuAlunos();
				while (op2 != 99) {
					switch (op2) {
					case 1:
						cadAluno();
						break;
					case 2:
						Aluno alu = buscaAluno();
						if(alu != null) {
							alu.dataUpdateAluno();
							alu.update();
						}else {
							System.out.println("Aluno não foi encontrado!");				
						}
						break;
					case 3:
						listaAlunos();
					default:
						break;
					}
					op2 = menuAlunos();
				}
				break;
			case 2:
				int op3 = menuProf();
				while (op3 != 99) {
					switch (op3) {
					case 1:
						cadProf();
						break;
					case 2:
						Professor prof = buscaProfessor();
						if(prof != null) {
							prof.dataUpdateProf();
							prof.update();
						}else {
							System.out.println("Professor não encontrado!");
						}
					case 3:
						listaProf();
						break;
					default:
						break;
						
					}
					op3 = menuProf();
				}
				
				break;
			case 99:
				System.out.println("Saindo do programa");
				System.exit(0);
				break;
			default:
				System.out.println("Opção invalida");
				System.exit(0);
				break;
			}
			op = menu();

		}

	}

	public static int menu() {
		int numMenu;
		try {
			System.out.println("MENU PRINCIPAL");
			System.out.println("Cadastro de Alunos e Cadastro de Professores ");
			System.out.println("Digite  1 para alunos");
			System.out.println("Digite 2 para Professores");
			System.out.println("Digite  99 para sair do programa");
			System.out.print("Digite aqui sua opção: ");
			numMenu = Integer.parseInt(scan.nextLine());
		} catch (InputMismatchException e) {
			scan.nextLine();
			System.out.println("Valor invalido");
			return 0;
		}
		return numMenu;
	}

	public static int menuAlunos() {
		int numMenu;
		try {
			System.out.println("MENU DE ALUNOS");
			System.out.println("1 - Cadastro de Alunos");
			System.out.println("2 - Atualizar Alunos");
			System.out.println("3 - Lista de Alunos");
			System.out.println("99 - Voltar");
			numMenu = scan.nextInt();
			scan.nextLine();
		} catch (InputMismatchException e) {
			scan.nextLine();
			System.out.println("Valor invalido");
			return 0;
		}
		return numMenu;
	}

	public static int menuProf() {
		int numMenu;
		try {
			System.out.println("MENU DE PROFESSORES");
			System.out.println("1 - Cadastro de Professores");
			System.out.println("2 - Atualizar um Professor");
			System.out.println("3 - Lista de Professores");
			System.out.println("99 - Voltar");
			numMenu = scan.nextInt();
			scan.nextLine();
		} catch (InputMismatchException e) {
			scan.nextLine();
			System.out.println("Valor invalido");
			return 0;
		}
		return numMenu;
	}

	public static void listaAlunos() {
		System.out.println("Dados dos Alunos:");
		System.out.println("-------------------------------------------");
		int i = 0;
		for (Aluno aluno : listaAlunos) {
			i = i+1;
			System.out.println("Número: "+ i);
			aluno.mostraDados();
			System.out.println("-------------------------------------------");
		
		}
	}
	
	public static void listaProf() {
		System.out.println("Dados dos Professores:");
		System.out.println("-------------------------------------------");
		int i = 1;
		for (Professor prof : listaProf) {
			System.out.println("Número: "+ i);
			i = i+1;
			prof.mostraDados();
			System.out.println("-------------------------------------------");
		}
		
	}	
	
	public static void cadAluno() {
		Aluno al = new Aluno();
		if (al != null && al.getMatricula() != 0) {
			al.save();
			System.out.println("Aluno criado com sucesso!");
			al.mostraDados();
		}
	}
	public static void cadProf() {
		Professor pf = new Professor();
		if (pf != null && pf.getCargaHoraria() != 0) {
			pf.save();
			System.out.println("Professor criado com sucesso!");
			pf.mostraDados();
		}
	}
	public static Professor buscaProfessor() {
		String pesquisa = "";
		System.out.println("Email do professor: ");
    	pesquisa = Escola.scan.nextLine();
    	System.out.println("\nProfessor encontrado!\n");
    	for (Professor prof : listaProf) {
    		if (prof.getEmail() == pesquisa) {
    			prof.setIndice(listaProf.indexOf(prof));
    			return prof;
    		}
    	}
    	return null;    	
	}
	public static Aluno buscaAluno() {
		String pesquisa = "";
		System.out.println("Email do aluno: ");
    	pesquisa = scan.nextLine();
    	System.out.println("\nAluno encontrado!\n");
    	for (Aluno alun : listaAlunos) {
    		if (pesquisa.equals(alun.getEmail())) {
    			alun.setIndice(listaAlunos.indexOf(alun));
    			return alun;
    		}
    	}
    	return null;    	
	}


}
