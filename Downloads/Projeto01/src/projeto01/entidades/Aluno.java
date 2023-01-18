package projeto01.entidades;

import projeto01.entidades.Pessoa;

public class Aluno extends Pessoa {

    private double mensalidade;

    public Aluno(int id, String nome, int idade, String sexo, String curso, double mensalidade) {
        super(id, nome, idade, sexo, curso);
        this.mensalidade = mensalidade;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "mensalidade=" + mensalidade +
                '}';
    }
}
