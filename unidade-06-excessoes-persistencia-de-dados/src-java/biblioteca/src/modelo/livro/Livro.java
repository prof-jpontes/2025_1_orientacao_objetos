package modelo.livro;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String isbn;
    private String titulo;
    private int ano;
    private byte edicao;
    private List<Autor> autores;
    private Editora editora;

    private int contadorExemplares=1;

    public Livro(String titulo, String isbn, int ano, byte edicao, List<Autor> autores, Editora editora) {
        if(titulo == null || titulo.isBlank()) throw new IllegalArgumentException("Título não pode ser vazio");
        if(isbn == null || isbn.isBlank()) throw new IllegalArgumentException("ISBN não pode ser vazio");
        if(editora == null) throw new IllegalArgumentException("Livro precisa ter uma editora");
        if(autores.isEmpty()) throw new IllegalArgumentException("Livro precisa ter ao menos um autor");
        this.isbn = isbn;
        this.titulo = titulo;
        this.ano = ano;
        this.edicao = edicao;
        this.autores = autores;
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", edicao=" + edicao +
                ", autores=" + autores +
                ", editora=" + editora +
                '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public String gerarCodigoExemplar(){
        String s = Integer.toString(contadorExemplares);
        if(contadorExemplares < 10) s = "0" + s;
        this.contadorExemplares++;
        return s;
    }

    public List<Exemplar> criarExemplar(int qde){
        List<Exemplar> exemplars = new ArrayList<>();
        Exemplar exemplar;
        for(int i=0; i<qde; i++){
            exemplar = new Exemplar(this);
            exemplars.add(exemplar);
        }
        return exemplars;
    }
}


