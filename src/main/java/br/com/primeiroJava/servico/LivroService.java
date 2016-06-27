package br.com.primeiroJava.servico;

import br.com.primeiroJava.model.Autor;
import br.com.primeiroJava.model.Livro;

/**
 * Created by Kleber on 27/06/2016.
 */
public class LivroService {

    public void postarLivro(String titulo, String isbn, String lancamento, String nomeAutor) {
        Livro primeiroLivro;
        primeiroLivro = new Livro();
        primeiroLivro.titulo = titulo;
        primeiroLivro.isbn = isbn;
        primeiroLivro.lancamento = lancamento;

        Autor autor = new Autor();
        autor.nome = nomeAutor;


    }
}
