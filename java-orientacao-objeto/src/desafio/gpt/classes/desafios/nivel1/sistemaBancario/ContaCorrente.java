package desafio.gpt.classes.desafios.nivel1.sistemaBancario;

public class ContaCorrente extends ContaBancaria implements Tributavel {
    private double taxaSaque = 5.0;
    private double taxaImposto = 0.01;

    public ContaCorrente(String titular, int numeroConta, double saldoInicial) {
        super(titular, numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorFinal = valor + this.taxaSaque;
        if (valor <= 0) return false;

        boolean podeSacar = valorFinal <= this.getSaldo();
        if (!podeSacar) return false;

        System.out.println("Saque feito no valor de R$" + valor + " mais a taxa de R$" + this.taxaSaque);
        super.debitar(valorFinal);
        return true;
    }

    @Override
    public double calcularImposto() {
        double imposto = this.getSaldo() * taxaImposto;
        return imposto;
    }
}
