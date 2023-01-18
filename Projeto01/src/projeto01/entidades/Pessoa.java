package projeto01.entidades;

public abstract class Pessoa {

   private int id;
   private String nome;
   private int idade;
   private String sexo;
   private String curso;

    public Pessoa(int id, String nome, int idade, String sexo, String curso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.curso = curso;
    }

    public Pessoa(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void visualizar(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Curso: " + curso);
    }
}
