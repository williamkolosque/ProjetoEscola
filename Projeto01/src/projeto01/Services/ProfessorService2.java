package projeto01.Services;

import projeto01.entidades.Professor;
import projeto01.repositories.ProfessorRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorService2 implements ProfessorRepository{
    private Boolean system = true;
    Scanner sc = new Scanner(System.in);

    ArrayList<Professor> SalvarProfessor = new ArrayList<>();
    //private ProfessorRepository professorRepository;

    @Override
    public void listarProfessor() {
        for (var professor : SalvarProfessor) {
            professor.visualizar();

        }
    }






    public void salvar() {
        Professor professor = new Professor();

  System.out.println();
    System.out.print("Informe um id para o usuário: ");
    professor.setId(sc.nextInt());

    System.out.print("Informe o nome: ");
    professor.setNome(sc.next());

    System.out.print("Informe a idade: ");
    professor.setIdade(sc.nextInt());

    System.out.print("Informe o curso: ");
    professor.setCurso(sc.next());

    System.out.print("Informe o valor da Salario: ");
    professor.setSalario(sc.nextDouble());

       // professorRepository.cadastrarProfessor(professor);

        SalvarProfessor.add(professor);

        System.out.println("Aluno cadastrado com sucesso!");

    /*
        System.out.println();
        System.out.print("Informe um id para o usuário: ");
        int id = sc.nextInt();

        System.out.print("Informe o nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Informe a idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe o curso: ");
        sc.nextLine();
        String curso = sc.nextLine();

        System.out.print("Informe o valor da salario: ");
        Double salario = sc.nextDouble();

        Professor professor = new Professor(id, nome, idade, curso, salario);

        professorRepository.cadastrarProfessor(professor);


        System.out.println("Aluno cadastrado com sucesso!");

*/











    }




    public void inicial(Scanner sc) {

        while (system) {
            System.out.println();
            System.out.println("0 - Voltar para o menu anterior");
            System.out.println("1 - Salvar");
            System.out.println("2 - Listar");
        /*System.out.println("3 - Listar todos");
        System.out.println("4 - Deletar");*/
            int action = sc.nextInt();

            switch (action) {
                case 1:
                    salvar();
                    break;
                case 2:

                     listarProfessor();

                    break;

                default:
                    system = false;
                    break;
            }
        }
    }}