package projeto01.controller;


import projeto01.entidades.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controller implements PessoaRepository{
    private Boolean system = true;

    ArrayList<Aluno>SalvarAluno = new ArrayList<>();







    public void inicial(Scanner sc) {

        while (system) {
            System.out.println();
            System.out.println("0 - Voltar para o menu anterior");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
            /*System.out.println("3 - Listar todos");
            System.out.println("4 - Deletar");*/
            int action = sc.nextInt();

            switch(action){
                case 1:

                   //cadastrar
                    System.out.println();
                    System.out.print("Informe um id para o usuário: ");
                   int id = sc.nextInt();

                    System.out.print("Informe o nome: "); sc.next();
                   String nome = sc.nextLine();

                    System.out.print("Informe a idade: ");
                   int idade = sc.nextInt();

                    System.out.print("Informe o sexo: ");
                    String sexo = sc.nextLine();


                    System.out.print("Informe o curso: ");
                  String curso = sc.nextLine();

                    System.out.print("Informe o valor da mensalidade: ");
                  double  mensalidade = sc.nextDouble();


                    System.out.println("Aluno cadastrado com sucesso!");
                    System.out.println();
                    //aluno.visualizar();

                    Aluno aluno = new Aluno(id, nome, idade, sexo ,curso, mensalidade);


                    SalvarAluno.add(aluno);


                    for (var nova : SalvarAluno ) {

                        aluno.visualizar();

                    }

                    break;
                case 2:



                    break;

                default:
                    system = false;
                    break;
            }
        }
    }

    Aluno a = new Aluno();

    @Override
    public void listarAluno() {

        for (var listar   :   SalvarAluno ) {

            a.visualizar();
        }

    }

    @Override
    public void cadastrarAluno() {

    }

    public void salvar(Scanner sc){





    }

    public void listarAlunos(){





    }
}
