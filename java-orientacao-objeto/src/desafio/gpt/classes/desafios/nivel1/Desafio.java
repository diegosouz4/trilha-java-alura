package desafio.gpt.classes.desafios.nivel1;

import desafio.gpt.classes.desafios.nivel1.sistemaProduto.Estoque;
import desafio.gpt.classes.desafios.nivel1.sistemaProduto.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {
        Produto produto1 = new Produto("iphone", 2000.00, 10);
        Produto produto2 = new Produto("fone", 20.00, 320);
        Produto produto3 = new Produto("teclado", 300.00, 40);
        Produto produto4 = new Produto("mouse", 50.00, 5);

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);

        produto2.adicionarEstoque(20);
        produto3.removerEstoque(10);

        double pegaValorTotal = estoque.calcularValorTotal();
        System.out.println("Valor total em estoque: " + pegaValorTotal);

        Produto encontrar = estoque.buscaProdutoPorNome("iphone");

        List<Produto> listacopy = estoque.listarProdutos();
        estoque.removerProduto("teclado");

        listacopy.add(produto4);

        System.out.println("Lista de produtos: " + estoque.toString());
        System.out.println("copia da lista de produtos: " + listacopy.toString());
    }
}
