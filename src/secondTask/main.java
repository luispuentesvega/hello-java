package secondTask;

/*
 * I use interface instead of abstract class 'cuz eac '
 * use:
 * > setters & getters : encapsulamiento
 * > 
 * 
 */

public abstract class main {
  public static void main(String[] args) {
    System.out.println("================CUADRADO===============");
    Cuadrado c = new Cuadrado();
    c.setLado(3);
    double area = c.calcularArea();
    System.out.println("El area del cuadrado es " + area);

    double perimetro = c.calcularPerimetro();
    System.out.println("El perimetro del cuadrado es " + perimetro);

    System.out.println("================CUBO===============");
    Cubo cubo = new Cubo();
    cubo.setLado(4);
    double cuboArea = cubo.calcularArea();
    System.out.println("El area del cubo es " + cuboArea);

    double cuboPerimetro = cubo.calcularPerimetro();
    System.out.println("El perimetro del cubo es " + cuboPerimetro);

    double cuboVolumen = cubo.calcularVolumen();
    System.out.println("El volumen del cubo es " + cuboVolumen);
  }
}
