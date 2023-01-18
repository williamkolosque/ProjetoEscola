package projeto01.entidades;

public class Professor extends Pessoa {


   private int salario;

    public Professor(int id, String nome, int idade, String sexo, String curso, int salario) {
        super(id, nome, idade, sexo, curso);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public void visualizar() {
        System.out.println();
        super.visualizar();
        System.out.println("Salário: " + salario);
    }
}
