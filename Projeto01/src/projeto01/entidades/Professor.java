package projeto01.entidades;

public class Professor extends Pessoa {


   private double salario;

    public Professor(int id, String nome, int idade, String curso, double salario) {
        super(id, nome, idade, curso);
        this.salario = salario;
    }

    public Professor(){

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void visualizar() {
        System.out.println();
        super.visualizar();
        System.out.println("Salário: " + salario);
    }
}
