package List.pesquisaLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro>  catalogo;

    public CatalagoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro (String titulo, String autor, int ano) {
        Livro livro = new Livro(titulo, autor, ano);
        catalogo.add(livro);
    }

    public List<Livro> perquisarPorAutor (String autor) {
        List<Livro> livros = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livros.add(livro);
            }
        }
        return livros;
    }

    public List<Livro> pesquisarPorIntervaloAno (int anoInicio, int anoFim) {
        List<Livro> livros = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getAno() >= anoInicio && livro.getAno() <= anoFim) {
                livros.add(livro);
            }
        }
        return livros;
    }

    public List<Livro> pesquisarPorTitulo (String titulo) {
        List<Livro> livros = new ArrayList<>();
        for (Livro livro : catalogo) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livros.add(livro);
            }
        }
        return livros;
    }

    public static void main(String[] args) {
        CatalagoLivros catalago = new CatalagoLivros();
        catalago.adicionarLivro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954);
        catalago.adicionarLivro("O Hobbit", "J. R. R. Tolkien", 1937);
        catalago.adicionarLivro("O Silmarillion", "J. R. R. Tolkien", 1977);
        catalago.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
        catalago.adicionarLivro("Anjos e Demônios", "Dan Brown", 2000);
        catalago.adicionarLivro("Fortaleza Digital", "Dan Brown", 1998);
        catalago.adicionarLivro("O Símbolo Perdido", "Dan Brown", 2009);
        catalago.adicionarLivro("Inferno", "Dan Brown", 2013);
        catalago.adicionarLivro("Origem", "Dan Brown", 2017);
        catalago.adicionarLivro("Ponto de Impacto", "Dan Brown", 2001);
        catalago.adicionarLivro("O Código Da Vinci", "Dan Brown", 2003);
        catalago.adicionarLivro("Anjos e Demônios", "Dan Brown", 2000);
        catalago.adicionarLivro("Fortaleza Digital", "Dan Brown", 1998);
        catalago.adicionarLivro("O Símbolo Perdido", "Dan Brown", 2009);
        catalago.adicionarLivro("Inferno", "Dan Brown", 2013);
        catalago.adicionarLivro("Origem", "Dan Brown", 2017);
        catalago.adicionarLivro("Ponto de Impacto", "Dan Brown", 2001);

        System.out.println("Livros de Dan Brown:");
        for (Livro livro : catalago.perquisarPorAutor("Dan Brown")) {
            System.out.println(livro);
        }

        System.out.println("\nLivros de 2000 a 2010:");
        for (Livro livro : catalago.pesquisarPorIntervaloAno(2000, 2010)) {
            System.out.println(livro);
        }

        System.out.println("\nLivros com o título 'O Código Da Vinci':");
    }



}
