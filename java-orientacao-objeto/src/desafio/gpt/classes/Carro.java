package desafio.gpt.classes;

public class Carro {
  private String modelo;
  private int velocidade;

  public Carro(String modelo){
    this.modelo = modelo;
  }

  public void acelerar(){
    this.velocidade += 10;
    System.out.println("Carro acelerou!");
  }

  public void frear(){
    if(this.velocidade == 0) {
      System.out.println("O carro já está parado!");
    } else if(this.velocidade - 10 <= 0) {
      System.out.println("O carro parou!");
      this.velocidade = 0;
    } else{
      System.out.println("Carro reduziu a velocidade.");
      this.velocidade -= 10;
    }
  }

  public void exibirVelocidade(){
    System.out.println("O carro modelo: " + this.modelo + " está a " + this.velocidade + "km/h.");
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getModelo() {
    return modelo;
  }

  public int getVelocidade() {
    return velocidade;
  }
}
