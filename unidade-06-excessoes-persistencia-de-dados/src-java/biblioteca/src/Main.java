import modelo.livro.Autor;
import modelo.livro.Editora;
import modelo.livro.Livro;
import modelo.util.Cpf;
import servico.ServicoUsuario;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoUsuario su = new ServicoUsuario();


        //su.cadastrarUsuario("João", "1234567809");
        //System.out.println(su.getUsuario());


        try{
            Autor autor1 = new Autor("Machado de Assis");
            Autor autor2 = new Autor("Miguel de Cervantes", "Espanha");
            Editora editora = new Editora("Excelência", "123456");
            Livro livro = new Livro(
                    "Memórias Póstumas",
                    "1234",
                    1881,
                    (byte)1,
                    List.of(autor1, autor2),
                    editora);
            System.out.println("Dados do livro: " + livro);
            System.out.println(livro.criarExemplar(4));
        }catch (IllegalArgumentException e){
            System.out.println("Não foi possível cadastrar o livro");
        }

    }
}