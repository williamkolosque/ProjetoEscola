public class Pessoa {

    String nome;
    int Idade;
    String Sexo;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        Idade = idade;
        Sexo = sexo;
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

    public void fazerAniversario(){

    }

}
