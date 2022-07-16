package secondTask;

public class Cuadrado implements FiguraGeometrica {
  private int lado;

  @Override
  public double calcularArea() {
    return this.lado * this.lado;
  }

  @Override
  public double calcularPerimetro() {
    return this.lado * 4;
  }

  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

}
