package projeto01.aplication;

import projeto01.Services.AlunoService;
import projeto01.Services.ProfessorService;
import projeto01.Services.ProfessorService2;
import projeto01.repositories.ProfessorRepository;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Boolean system = true;


        while (system) {

                System.out.println("***       Escola Maria Terezinha      ***");
                System.out.println("******************************************");
                System.out.println("           Escolha A sua opção:           ");
                System.out.println(" 1 - Para Aluno");
                System.out.println(" 2 - Para Professor");
                System.out.println(" 0 - Para Sair");
                System.out.println("******************************************");
            int action = 3;

            try {

                action = sc.nextInt();

            }catch (InputMismatchException e){

                System.out.println("Digite um número");
                System.out.println("O sistema só aceita números!");
                sc.nextLine();
                action =3;

            }


                 switch (action) {

                     case 1:
                         AlunoService aluno = new AlunoService();
                         aluno.inicial(sc);
                         break;
                     case 2:
                         //  ProfessorService professor = new ProfessorService();
                         //  professor.inicial(sc);
                         ProfessorService2 professor = new ProfessorService2();
                         professor.inicial(sc);
                         break;

                     default:
                        System.out.println(" Programa finalizado! ");

                         system = false;
                 }

                }

            }
        }




