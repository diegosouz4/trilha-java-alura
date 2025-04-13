package desafio.gpt.classes;

public class Funcionario {
  private String nome;
  private String cargo;
  private double salario;

  public Funcionario(String nome, String cargo, double salario){
    this.nome = nome;
    this.cargo = cargo;
    if(salario <= 0) {
      System.out.println("Valor de salário inválido!");
    }else{
      this.salario = salario;
    }
  }

  public void promover(String novoCargo, double aumento){
    if(aumento <= 0) {
      System.out.println("Valor inválido!");
    }else if(aumento <= this.salario){
      System.out.println("Valor do aumento não pode ser igual ao valor atual do salário!");
    }else{
      System.out.println("Funcionário promovido!");
      this.cargo = novoCargo;
      this.salario += aumento;
    }
  }

  public void exibirInformacoes() {
    System.out.println(String.format("""
    \nNome do funcionário: %s;
    Cargo atual: %s;
    Salário atual: R$ %.2f;
    """, this.nome, this.cargo, this.salario));
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public double getSalario() {
    return salario;
  }

  public String getCargo() {
    return cargo;
  }
}
