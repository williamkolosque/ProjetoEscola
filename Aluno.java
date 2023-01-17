public class Aluno {

    int matricula;
    String Curso;


    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        Curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public void CancelaMatricula(){

    }


}
