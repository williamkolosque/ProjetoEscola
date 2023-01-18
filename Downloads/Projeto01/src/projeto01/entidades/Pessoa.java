package projeto01.entidades;

public class Pessoa {

   private int id;
   private String nome;
   private int Idade;
   private String Sexo;
   private String curso;

    public Pessoa(int id, String nome, int idade, String sexo, String curso) {
        this.id = id;
        this.nome = nome;
        Idade = idade;
        Sexo = sexo;
        this.curso = curso;
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
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Idade=" + Idade +
                ", Sexo='" + Sexo + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
