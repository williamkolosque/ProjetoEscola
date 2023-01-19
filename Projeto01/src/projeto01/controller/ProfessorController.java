package projeto01.controller;

import projeto01.entidades.Professor;
import projeto01.repositories.ProfessorRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfessorController extends Professor implements ProfessorRepository {
    ArrayList<Professor> SalvarProfessor = new ArrayList<>();


    public ProfessorController() {
    }

    @Override
    public void listarProfessor() {
        for (var professor : SalvarProfessor) {
            professor.visualizar();

        }
    }

    //@Override
   // public void cadastrarProfessor(Professor professor) {

      //  SalvarProfessor.add(professor);

  //  }
}
