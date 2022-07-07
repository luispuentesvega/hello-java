package mascota;

public class Pez extends Mascota {
  private int nroDeAletas;
  private boolean esDeAguaSalada;
  private int velocidadAlNadar;

  @Override
  protected void comer() {
    System.out.println("[Pez] Su mascota " + this.getNombre() + " esta comiendo " + this.getComidaFavorita());
  }

  protected void nadar() {
    System.out.println(
        "[Pez] La velocidad al nadar de su mascota " + this.getNombre() + " es " + this.velocidadAlNadar);
  }

  public int getNroDeAletas() {
    return nroDeAletas;
  }

  public void setNroDeAletas(int nroDeAletas) {
    this.nroDeAletas = nroDeAletas;
  }

  public boolean isEsDeAguaSalada() {
    return esDeAguaSalada;
  }

  public void setEsDeAguaSalada(boolean esDeAguaSalada) {
    this.esDeAguaSalada = esDeAguaSalada;
  }

  public int getVelocidadAlNadar() {
    return velocidadAlNadar;
  }

  public void setVelocidadAlNadar(int velocidadAlNadar) {
    this.velocidadAlNadar = velocidadAlNadar;
  }

}
