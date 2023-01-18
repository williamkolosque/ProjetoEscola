package services;

import entities.Aluno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlunoService {
    private Boolean system = true;

    public void inicial(Scanner sc) {
        while (system) {
            System.out.println();
            System.out.println("0 - Voltar para o menu anterior");
            System.out.println("1 - Salvar");
            /*System.out.println("2 - Atualizar");
            System.out.println("3 - Listar todos");
            System.out.println("4 - Deletar");*/
            int action = sc.nextInt();

            switch(action){
                case 1:
                    salvar(sc);
                    break;
                default:
                    system = false;
                    break;
            }
        }
    }

    public void salvar(Scanner sc){
        System.out.println();
        System.out.print("Informe um id para o usuário: ");
        long id = sc.nextLong();

        System.out.print("Informe o nome: "); sc.next();
        String nome = sc.nextLine();

        System.out.print("Informe o curso: ");
        String curso = sc.nextLine();

        System.out.print("Informe o valor da mensalidade: ");
        Double mensalidade = sc.nextDouble();

        Aluno aluno = new Aluno(id, nome, curso, mensalidade);
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println();
        aluno.visualizar();

    }
}
