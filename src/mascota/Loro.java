package mascota;

public class Loro extends Mascota {
  private boolean sabeHablar;
  private int velocidadDeVuelo;
  private int peso;

  @Override
  protected void comer() {
    System.out.println("[Loro] Su mascota " + this.getNombre() + " esta comiendo " + this.getComidaFavorita());
  }

  protected void volar() {
    System.out.println(
        "[Loro] La velocidad de vuelo de su mascota " + this.getNombre() + " es " + this.velocidadDeVuelo);
  }

  @Override
  public String toString() {
    return "Loro [peso=" + peso + ", sabeHablar=" + sabeHablar + ", velocidadDeVuelo=" + velocidadDeVuelo + "]";
  }

  public boolean isSabeHablar() {
    return sabeHablar;
  }

  public void setSabeHablar(boolean sabeHablar) {
    this.sabeHablar = sabeHablar;
  }

  public int getVelocidadDeVuelo() {
    return velocidadDeVuelo;
  }

  public void setVelocidadDeVuelo(int velocidadDeVuelo) {
    this.velocidadDeVuelo = velocidadDeVuelo;
  }

  public int getPeso() {
    return peso;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

}
