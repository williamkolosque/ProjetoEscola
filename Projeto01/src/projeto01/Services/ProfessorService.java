package projeto01.Services;


import projeto01.entidades.Aluno;
import projeto01.entidades.Professor;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class ProfessorService {


        private Boolean system = true;
        List<Professor> list = new ArrayList<>();

        public void inicial(Scanner sc) {
            while (system) {
                System.out.println(" ");
                System.out.println("--------------------------------");
                System.out.println(" Você está em: MODULO DO PROFESSOR  ");
                System.out.println(" O que deseja fazer?");
                System.out.println("--------------------------------");
                System.out.println("0 - Voltar para o menu anterior");
                System.out.println("1 - Cadastrar Professor");
                System.out.println("2 - Listar todos");
                System.out.println("--------------------------------");
                System.out.print("Digite uma opção: ");
                int action = 3;

                try {

                    action = sc.nextInt();

                }catch (InputMismatchException e){

                    System.out.println("Digite um número");
                    System.out.println("O sistema só aceita números!");
                    sc.nextLine();
                    action =3;

                }
              if(action>0 || action<=2){
                switch(action){
                    case 1:
                        cadastrar(sc);
                        break;
                    case 2:
                        listarTodos(sc);
                        break;



                    default:
                        system = false;
                        break;
                }
            }
              if(action>=3){
                  System.out.println("ERRO: DIGITE UMA OPÇÃO VALIDA");
                  System.out.println(" ");
              }
            }

        }

        public void cadastrar(Scanner sc) {
            System.out.println();
            System.out.print("Digite a quantidade de Professores que deseja cadastrar: ");
            int qnt = sc.nextInt();

            for (int i = 0; i < qnt; i++) {
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

                System.out.print("Informe o valor do salario: ");
                Double salario = sc.nextDouble();

                Professor professor = new Professor(id, nome, idade, curso,salario);
                list.add(professor);

                System.out.println();
                System.out.println("Cadastro realizado com sucesso!");
                System.out.println(" ");
                System.out.println();
            }
        }



        public void listarTodos(Scanner sc){
            for(Professor a : list){
                System.out.println("|Id: " + a.getId() + " | Nome: " + a.getNome()+" | Idade: "+a.getIdade() + " | Curso: " + a.getCurso() + " | Salario: " + a.getSalario() + " |");
            }
        }
    }








