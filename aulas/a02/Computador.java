public class Computador {
  boolean ligado;

  void ligar() {
    this.ligado = true;
  }

  void desligar() {
    this.ligado = false;
  }

  void estudar() {
    if (this.ligado == true)
      System.out.println("Estudando...");
    else
      System.out.println("Ligue o computador e tente novamente!");
  }
}