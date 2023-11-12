public class Escola {
    public int matricula;
    public String nome;
    public int nota1;
    public int nota2;
    public int notaTrabalho;
    public double media;

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return this.nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return this.nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNotaTrabalho() {
        return this.notaTrabalho;
    }

    public void setNotaTrabalho(int notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public Escola(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public double media(){
        double notas = this.nota1 * 4 + this.nota2 *4 / 8;
        return media;
    }

    public void MediaFinal(){
        double notaFinal = this.media - 10.00;
    }
}
