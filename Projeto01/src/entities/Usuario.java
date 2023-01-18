package entities;

public abstract class Usuario {

    private long id;
    private String nome;
    private String curso;

    public Usuario() {
    }

    public Usuario(long id, String nome, String curso) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        System.out.println("Curso: " + curso);
    }
}