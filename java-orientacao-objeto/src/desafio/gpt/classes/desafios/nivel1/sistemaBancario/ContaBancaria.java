package desafio.gpt.classes.desafios.nivel1.sistemaBancario;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo = 0.0;

    public ContaBancaria(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        if (saldoInicial >= 0) this.saldo = saldoInicial;
    }

    public void exibirDados() {
        System.out.println(String.format("""
                Titular: %s,
                Numero da conta: %d,
                Saldo atual: R$ %.1f
                """, this.titular, this.numeroConta, this.saldo));
    }

    protected void debitar(double valor) {
        if (valor > 0) {
            this.saldo -= valor;
        }
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        System.out.println("Deposito feito no valor de R$" + valor);
        this.saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            return false;
        } else if (valor > this.saldo) {
            return false;
        }

        System.out.println("Saque feito no valor de R$" + valor);
        this.saldo -= valor;
        return true;
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Nao pode transferir valor negativo");
        } else if (destino.getNumeroConta() == this.numeroConta) {
            throw new IllegalArgumentException("Nao pode trasferir para a propria conta");
        } else if (valor > this.saldo) {
            throw new IllegalArgumentException("Valor de trasferencia maior que saldo atual");
        }
        boolean fezSaque = this.sacar(valor);
        if (!fezSaque) {
            throw new IllegalArgumentException("Erro ao tentar sacar");
        }

        boolean fezDeposito = destino.depositar(valor);
        if (!fezDeposito) {
            this.saldo += valor;
            throw new IllegalArgumentException("Erro ao tentar depositar");
        }

        System.out.println("Nova transferencia feita no valor de R$" + valor + " para a conta " + destino.getNumeroConta());

    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }
}
