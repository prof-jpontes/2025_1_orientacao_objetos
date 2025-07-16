package modelo.livro;

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome) {
        this.nome = nome;
        this.nacionalidade = "Desconhecida";
    }

    @Override
    public String toString() {
        return "Autor: " + nome;
    }
}
