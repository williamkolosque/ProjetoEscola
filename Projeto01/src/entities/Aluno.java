package entities;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario{

    private Double mensalidade;

    public Aluno(long id, String nome, String curso, Double mensalidade) {
        super(id, nome, curso);
        this.mensalidade = mensalidade;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public void visualizar() {
        System.out.println();
        super.visualizar();
        System.out.println("Mensalidade: " + mensalidade);
    }
}
