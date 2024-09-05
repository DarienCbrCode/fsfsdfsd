/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pkg2;

/**
 *
 * @author yaneth
 */
public class Triangulo extends FiguraGeometrica {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    // Constructor sin parámetros
    public Triangulo() {
        super("Triángulo");
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    // Constructor con parámetros
    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        super("Triángulo");
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    // Métodos de acceso
    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "Triángulo: " + getNombre() + " tiene 3 Puntos: " 
               + punto1.toString() + ", " + punto2.toString() + ", " + punto3.toString();
    }

    // Sobrescribir el método calcularArea
    @Override
    public double calcularArea() {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // Sobrescribir el método esFiguraRegular
    @Override
    public boolean esFiguraRegular() {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        return lado1 == lado2 && lado2 == lado3;
    }
}
