package application;
import entities.Aluno;
import entities.Professor;
import services.AlunoService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean system = true;


        while (system) {
            System.out.println("***       Escola Maria Terezinha      ***");
            System.out.println("******************************************");
            System.out.println("           Escolha A sua opção:           ");
            System.out.println(" 1 - Para Aluno");
            System.out.println(" 2 - Para Professor");
            System.out.println("******************************************");
            int action = sc.nextInt();

            switch(action){
                case 1:
                    AlunoService aluno = new AlunoService();
                    aluno.inicial(sc);
                    break;
                case 2:
                    /*Aluno a = new Aluno(01, "Roberto", "Matemática",350.00);
                    a.visualizar();

                    Professor prof = new Professor(02, "Anna Rita", "Psicologia", 10000.00);
                    prof.visualizar();*/
                    break;
                default:
                    system = false;
            }
        }
    }
}
