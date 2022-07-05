package mascota;

public class Loro extends Mascota {
  private boolean sabeHablar;
  private int velocidadDeVuelo;
  private int peso;

  @Override
  protected void comer() {
    System.out.println("[Loro] Su mascota " + this.getNombre() + " esta comiendo " + this.getComidaFavorita());
  }

  private void volar() {
    System.out.println(
        "[Loro] La velocidad de vuelo de su mascota " + this.getNombre() + " es " + this.velocidadDeVuelo);
  }
}
