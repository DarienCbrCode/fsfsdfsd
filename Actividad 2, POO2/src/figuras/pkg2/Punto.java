/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pkg2;

/**
 *
 * @author yaneth
 */
public class Punto {
    private double coordenaX;
    private double coordenaY;

    // Constructor sin parámetros
    public Punto() {
        this.coordenaX = 0;
        this.coordenaY = 0;
    }

    // Constructor con parámetros
    public Punto(double coordenaX, double coordenaY) {
        this.coordenaX = coordenaX;
        this.coordenaY = coordenaY;
    }

    // Métodos de acceso
    public double getCoordenaX() {
        return coordenaX;
    }

    public double getCoordenaY() {
        return coordenaY;
    }

    // Métodos de manipulación
    public void setCoordenaX(double coordenaX) {
        this.coordenaX = coordenaX;
    }

    public void setCoordenaY(double coordenaY) {
        this.coordenaY = coordenaY;
    }

    // Método toString
    @Override
    public String toString() {
        return "El punto tiene las siguientes coordenadas: " + coordenaX + ", " + coordenaY;
    }

    // Método para calcular la distancia desde otro punto
    public double calcularDistancia(Punto otroPunto) {
        return Math.sqrt(Math.pow(otroPunto.getCoordenaX() - this.coordenaX, 2) +
                         Math.pow(otroPunto.getCoordenaY() - this.coordenaY, 2));
    }

    // Sobrecarga del método calcularDistancia sin parámetros
    public double calcularDistancia() {
        return calcularDistancia(new Punto(0, 0)); // Asumiendo que el origen (0,0) es el punto de referencia
    }
}
