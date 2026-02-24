package desafio.gpt.classes.desafios.nivel1.sistemaProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade = 0;

    public Produto(String nome, double preco, int quantidade) {
        if (preco <= 0.0) throw new IllegalArgumentException("Preco nao pode ser negativo");
        if (quantidade < 0) throw new IllegalArgumentException("Quantidade nao pode ser negativa");

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotalEstoque() {
        return this.preco * this.quantidade;
    }

    public void adicionarEstoque(int novaQuantidade) {
        if (novaQuantidade < 0) throw new IllegalArgumentException("Quantidade nao pode ser negativa");
        this.quantidade += novaQuantidade;
    }

    public void removerEstoque(int remover) {
        if (remover < 0 || remover > this.quantidade) throw new IllegalArgumentException("Quantidade nao pode ser negativa");
        this.quantidade -= remover;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
