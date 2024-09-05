/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras.pkg2;

/**
 *
 * @author yaneth
 */
public class Main {
    public static void main(String[] args) {
        // Crear puntos
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(3, 0);
        Punto p3 = new Punto(3, 4);

        // Crear triángulo
        Triangulo triangulo = new Triangulo(p1, p2, p3);
        
        // Crear superficie plana y agregar figuras
        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(triangulo);

        // Mostrar áreas
        superficie.mostrarAreas();

        // Mostrar información del triángulo
        System.out.println(triangulo);
    }
}
