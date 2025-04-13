package desafio.gpt.classes;

public class AlunosNotas {
  private String nome;
  private double nota1;
  private double nota2;

  public AlunosNotas(String nome){
    this.nome = nome;
  }

  public double calcularMedia(){
    if(this.nota1 > 0 && this.nota2 > 0){
      return (this.nota1 + this.nota2) / 2;
    } else {
      System.out.println("Não foi possível calcular a média!");
      return -1;
    }
  }

  public boolean aprovado() {
    if(this.calcularMedia() >= 6){
      System.out.println("Aluno aprovado!");
      return true;
    }else{
      System.out.println("Aluno reprovado!");
      return false;
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNota1(double nota1) {
    if(nota1 >= 0 ) this.nota1 = nota1;
  }

  public void setNota2(double nota2) {
    if(nota2 >= 0) this.nota2 = nota2;
  }

  public String getNome() {
    return nome;
  }

  public double getNota1() {
    return nota1;
  }

  public double getNota2() {
    return nota2;
  }
}
