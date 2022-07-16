package secondTask;

public class Cubo implements FiguraGeometrica, TresDimensiones {
  private int lado;

  @Override
  public double calcularArea() {
    return 6 * Math.pow(this.lado, 2);
  }

  @Override
  public double calcularPerimetro() {
    return 12 * this.lado;
  }

  public int getLado() {
    return lado;
  }

  public void setLado(int lado) {
    this.lado = lado;
  }

  @Override
  public double calcularVolumen() {
    return Math.pow(this.lado, 3);
  }

}
