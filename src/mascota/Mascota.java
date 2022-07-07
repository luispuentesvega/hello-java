package mascota;

public class Mascota {
  private String nombre;
  private int edad;
  private String color;
  private String comidaFavorita;

  public static void main(String[] args) {
    System.out.println("=========Perro=========");
    Perro miPerro = new Perro();
    miPerro.setNombre("Baco");
    miPerro.setColor("Blanco Y Negro");
    miPerro.setEdad(10);
    miPerro.setComidaFavorita("Pollo");
    miPerro.setRaza("French Bulldog");
    miPerro.setEsterilizado(true);
    miPerro.setVelocidadAlCorrer(20);
    miPerro.setPeso(15);

    miPerro.comer();
    miPerro.correr();
    System.out.println(miPerro.toString());

    System.out.println("=========Loro=========");
    Loro miLoro = new Loro();
    miLoro.setNombre("Paco");
    miLoro.setColor("Amarillo");
    miLoro.setEdad(2);
    miLoro.setComidaFavorita("Alpiste");
    miLoro.setSabeHablar(true);
    miLoro.setVelocidadDeVuelo(40);
    miLoro.setPeso(10);

    miLoro.comer();
    miLoro.volar();
    System.out.println(miLoro.toString());

    System.out.println("=========Pez=========");
    Pez miPez = new Pez();
    miPez.setNombre("Nemo");
    miPez.setColor("Azul");
    miPez.setEdad(2);
    miPez.setComidaFavorita("larvas");
    miPez.setNroDeAletas(2);
    miPez.setEsDeAguaSalada(true);
    miPez.setVelocidadAlNadar(100);

    miPez.comer();
    miPez.nadar();
    System.out.println(miPez.toString());
  }

  @Override
  public String toString() {
    return "Mascota [nombre=" + getNombre() + ", edad=" + edad + ", color=" + color + ", comidaFavorita="
        + comidaFavorita + "]";
  }

  protected void comer() {
    System.out.println("Su mascota " + this.getNombre() + " esta comiendo " + this.comidaFavorita);
  }

  // add getter and setter to access private methods from their children
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getComidaFavorita() {
    return comidaFavorita;
  }

  public void setComidaFavorita(String comidaFavorita) {
    this.comidaFavorita = comidaFavorita;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

}
