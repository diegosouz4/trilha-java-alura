package desafio.gpt.classes;

public class ContaBancaria {
  private String titular;
  private double saldo;

  public ContaBancaria(String newTitular, double saldoInicial){
    this.titular = newTitular;
    if(saldoInicial >= 0) {
      this.saldo = saldoInicial;
    }
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public void setSaldo(double saldo) {
    if(saldo >= 0) this.saldo = saldo;
  }

  public void depositar(double valor){
    if(valor < 0) {
      System.out.println("Não é possível depositar valor negativo! Por favor insira um valor válido.");
    }else{
      this.saldo += valor;
      System.out.println("\nDeposito feito com sucesso! O saldo foi atualizado para R$" + this.saldo);
    }
  }

  public void sacar(double valor){
    if(valor > this.saldo){
      System.out.println("Saldo insuficiente! tente novamente.");
    }else{
      this.saldo -= valor;
      System.out.println("\nSaque feito com sucesso! Saldo atualizado: R$" + this.saldo);
    }
  }

  public void exibirSaldo(){
    System.out.println("Olá " + this.titular + ", seu saldo atual: R$" + this.saldo);
  }
}
