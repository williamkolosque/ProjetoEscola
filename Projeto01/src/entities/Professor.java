package entities;

public class Professor extends Usuario{

    private Double salario;

    public Professor(long id, String nome, String curso, Double salario) {
        super(id, nome, curso);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void visualizar() {
        System.out.println();
        super.visualizar();
        System.out.println("Salário: " + salario);
    }
}
