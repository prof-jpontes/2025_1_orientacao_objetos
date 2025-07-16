package modelo.livro;

public class Exemplar {
    private String serie;
    private Livro livro;

    public Exemplar(Livro livro) {
        this.livro = livro;
        this.serie = livro.getIsbn() + "-" + livro.gerarCodigoExemplar();
    }

    @Override
    public String toString() {
        return "Serie='" + serie + '\'';
    }
}
