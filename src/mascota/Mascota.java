package mascota;

public class Mascota {
  private String nombre;
  private int edad;
  private String color;
  private String comidaFavorita;

  public static void main(String[] args) {
    Perro miPerro = new Perro();
    miPerro.setNombre("Baco");
    miPerro.setColor("Blanco Y Negro");
    miPerro.setEdad(10);
    miPerro.setComidaFavorita("Pollo");
    miPerro.setRaza("French Bulldog");
    miPerro.setEsterilizado(true);
    miPerro.setVelocidadAlCorrer(20);
    miPerro.setPeso(15);

    System.out.println("=========Perro=========");
    miPerro.comer();
    miPerro.correr();
    miPerro.toString();
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
