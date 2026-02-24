package desafio.gpt.classes.desafios.nivel1.sistemaProduto;

import java.util.*;

public class Estoque {
    private List<Produto> listaProdutos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {

        boolean jaExiste = listaProdutos.stream().anyMatch(p -> p.getNome().equalsIgnoreCase(produto.getNome()));
        if (jaExiste) throw new IllegalArgumentException("Produto ja existe");

        listaProdutos.add(produto);
        this.ordenaProdutos();
    }

    public void removerProduto(String nome) {
        Produto removerProduto = this.buscaProdutoPorNome(nome);
        listaProdutos.remove(removerProduto);
    }

    private void ordenaProdutos() {
        listaProdutos.sort(Comparator.comparingDouble(Produto::getPreco));
    }

    public Produto buscaProdutoPorNome(String nome) {
        if (nome.isBlank()) throw new IllegalArgumentException("nome nao pode estar em branco");
        if (listaProdutos.isEmpty()) throw new IllegalArgumentException("Nao foi possivel encontrar o produto");

        return listaProdutos.stream().filter(produto -> produto.getNome().equalsIgnoreCase(nome)).findFirst().orElseThrow(() -> new NoSuchElementException("Produto '%s' nao encontrado".formatted(nome)));
    }

    public double calcularValorTotal() {
        return listaProdutos.stream().mapToDouble(Produto::calcularValorTotalEstoque).sum();
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(listaProdutos);
    }

    @Override
    public String toString() {
        return "Estoque{" + "listaProdutos=" + listaProdutos + '}';
    }
}
