package desafio.gpt.classes.desafios.nivel1.sistemaBancario;

public class ContaPoupanca extends ContaBancaria {
    private double saldoMinimo = 100.0;

    public ContaPoupanca(String titular, int numeroConta, double saldoInicial) {
        super(titular, numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= 0 ) return false;

        double saldoAtual = this.getSaldo();
        boolean podeSacar = (saldoAtual - valor) >= saldoMinimo;

        if(!podeSacar ) return false;
        return super.sacar(valor);
    }
}
