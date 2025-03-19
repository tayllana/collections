package Set.Ordenacao;

//1. Cadastro de Produtos
//Crie uma classe chamada "CadastroProdutos" que possui um conjunto de objetos do tipo "Produto" como atributo. Cada produto possui atributos como nome, cod, preço e quantidade. Implemente os seguintes métodos:
//
//adicionarProduto(long cod, String nome, double preco, int quantidade): Adiciona um produto ao cadastro.
//exibirProdutosPorNome(): Exibe todos os produtos do cadastro em ordem alfabética pelo nome.
//exibirProdutosPorPreco(): Exibe todos os produtos do cadastro em ordem crescente de preço.

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new TreeSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtos.add(new Produto(nome, cod, preco, quantidade));
    }

    public void exibirProdutosPorNome() {
        Set<Produto> comparaPorNome = new TreeSet<>(produtos);

        System.out.println(comparaPorNome);
    }

    public void exibirProdutosPorPreco() {
        Set<Produto> comparaPorPreco = new TreeSet<>((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
        comparaPorPreco.addAll(produtos);

        System.out.println(comparaPorPreco);
    }

}
