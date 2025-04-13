package desafio.gpt.classes;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String initialName, int initialIdade){
    nome = initialName;
    idade = initialIdade;
  }

  public void exibirDados(){
    System.out.println("\nSeu nome é " + nome + " e você tem " + idade + " anos.\n");
  }
  public void fazerAniversario(){
    idade++;
    System.out.println("\nParabéns você fez aniversário! Agora tem " + idade + " anos.");
  }

}
