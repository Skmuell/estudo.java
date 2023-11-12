public class Pessoa {

    public String nome;

    public int idade;

    public String profissao;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void informacao(){
        System.out.println("Esse é o nome da pessoa = " + this.nome + " " + "essa é a idade da pessoa = " + this.idade + " e essa é a profissão da pessoa = " + this.profissao);
    }

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

}