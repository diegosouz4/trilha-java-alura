package desafios.desafio2.modelos;

public class Carro {
    private String nomeModelo;
    private Double preco1;
    private Double preco2;
    private Double preco3;

    public void setNomeModelo(String modelo) {
        this.nomeModelo = modelo;
    }

    public void setPrecos(Double preco1, Double preco2, Double preco3) {
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public void getInfo() {
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preco1: " + preco1);
        System.out.println("Preco2: " + preco2);
        System.out.println("Preco3: " + preco3);
        System.out.println("Menor preco: " + getMenorPreco());
        System.out.println("Maior preco: " + getMaiorPreco());
    }

    public Double getMenorPreco() {
        Double[] list = {this.preco1, this.preco2, this.preco3};
        Double result = list[0];

        for (Double aDouble : list) {
            if (aDouble < result) {
                result = aDouble;
            }
        }

        return result;
    }

    public Double getMaiorPreco() {
        Double[] list = {this.preco1, this.preco2, this.preco3};
        Double result = 0.0;

        for (Double aDouble : list) {
            if (aDouble > result) {
                result = aDouble;
            }
        }

        return result;
    }
}
