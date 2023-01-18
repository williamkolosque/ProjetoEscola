package projeto01.aplication;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opt2 = 8;
        int opt3 = 8;
        int opt = 8;
        while (opt != 0) {
            System.out.println("***       Escola Maria Terezinha      ***");
            System.out.println("******************************************");
            System.out.println("           Escolha A sua opção:           ");
            System.out.println(" 1 - Para Aluno");
            System.out.println(" 2 - Para Professor");
            System.out.println("******************************************");
            opt = ler.nextInt();


            switch (opt) {

                case 1:
                    // while (opt2 != 0) {
                         System.out.println("***         Menu Aluno       ***");
                         System.out.println("******************************************");
                         System.out.println("           Escolha A sua opção:           ");
                         System.out.println(" 1 - Listar Alunos");
                         System.out.println(" 2 - Cadastrar Alunos");
                         System.out.println(" 3 - Editar Alunos");
                         System.out.println(" 4 - Excluir Alunos");
                         System.out.println("******************************************");
                         opt2 = ler.nextInt();


                         switch (opt2) {
                             case 1:
                                 System.out.println("***       Listagem       ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 2:
                                 System.out.println("***       Cadastro       ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 3:
                                 System.out.println("***       Editar         ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 4:
                                 System.out.println("***       Excluir        ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;

                         }

                         break;
                    // }

                case 2:
                   //  while (opt2 != 0) {
                         System.out.println("***         Menu Professor       ***");
                         System.out.println("******************************************");
                         System.out.println("           Escolha A sua opção:           ");
                         System.out.println(" 1 - Listar Professor");
                         System.out.println(" 2 - Cadastrar Professor");
                         System.out.println(" 3 - Editar Professor");
                         System.out.println(" 4 - Excluir Professor");
                         System.out.println("******************************************");
                         opt3 = ler.nextInt();


                         switch (opt3) {
                             case 1:
                                 System.out.println("***       Listagem       ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 2:
                                 System.out.println("***       Cadastro       ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 3:
                                 System.out.println("***       Editar         ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;
                             case 4:
                                 System.out.println("***       Excluir        ***");
                                 System.out.println("******************************************");
                                 System.out.println("******************************************");
                                 break;

                         }

                         break;

                    // }
            }

        }
    }
}

