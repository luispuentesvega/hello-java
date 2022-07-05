package mascota;

public class Perro extends Mascota {
  private String raza;
  private boolean esterilizado;
  private int velocidadAlCorrer;
  private int peso;

  @Override
  protected void comer() {
    System.out.println("[Perro] Su mascota " + this.getNombre() + " esta comiendo " + this.getComidaFavorita());
  }

  protected void correr() {
    System.out.println("[Perro] La velocidad de su mascota " + this.getNombre() + " es " + this.velocidadAlCorrer);
  }

  @Override
  public String toString() {
    return "Perro [raza=" + raza + ", esterilizado=" + esterilizado + ", velocidadAlCorrer=" + velocidadAlCorrer
        + ", peso=" + peso + "]";
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public boolean isEsterilizado() {
    return esterilizado;
  }

  public void setEsterilizado(boolean esterilizado) {
    this.esterilizado = esterilizado;
  }

  public int getVelocidadAlCorrer() {
    return velocidadAlCorrer;
  }

  public void setVelocidadAlCorrer(int velocidadAlCorrer) {
    this.velocidadAlCorrer = velocidadAlCorrer;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

}
