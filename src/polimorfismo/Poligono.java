/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;



public abstract class Poligono {
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Polígono";
    }
}
