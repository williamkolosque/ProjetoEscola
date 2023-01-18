package projeto01.entidades;

import projeto01.entidades.Pessoa;

public class Aluno extends Pessoa {

    private double mensalidade;

    public Aluno(int id, String nome, int idade, String sexo, String curso, double mensalidade) {
        super(id, nome, idade, sexo, curso);
        this.mensalidade = mensalidade;
    }

    public Aluno() {

    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void visualizar() {
        System.out.println();
        super.visualizar();
        System.out.println("Mensalidade: " + mensalidade);

    }
}
