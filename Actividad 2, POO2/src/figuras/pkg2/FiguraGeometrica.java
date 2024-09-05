/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pkg2;

/**
 *
 * @author yaneth
 */
public abstract class FiguraGeometrica {
    protected String nombre;

    // Constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos abstractos
    public abstract double calcularArea();
    public abstract boolean esFiguraRegular();
}
