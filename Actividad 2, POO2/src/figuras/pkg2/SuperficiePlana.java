/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras.pkg2;

/**
 *
 * @author yaneth
 */

import java.util.ArrayList;

public class SuperficiePlana {
    private ArrayList<FiguraGeometrica> figuras;

    // Constructor
    public SuperficiePlana() {
        this.figuras = new ArrayList<>();
    }

    // Método para agregar una figura
    public void agregarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }

    // Método para obtener las áreas de todas las figuras
    public void mostrarAreas() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println("El área de " + figura.getNombre() + " es: " + figura.calcularArea());
        }
    }
}
