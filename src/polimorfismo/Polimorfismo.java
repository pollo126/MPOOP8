/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Polimorfismo en acción
        Poligono poligonoTriangulo = new Triangulo(60, 60, 60, 5, 5, 5, 4, 3);
        Poligono poligonoCuadrilatero = new Cuadrilatero(90, 90, 4, 4, 4, 4);

        System.out.println(poligonoTriangulo);
        System.out.println("Área: " + poligonoTriangulo.area());
        System.out.println("Perímetro: " + poligonoTriangulo.perimetro());

        System.out.println(poligonoCuadrilatero);
        System.out.println("Área: " + poligonoCuadrilatero.area());
        System.out.println("Perímetro: " + poligonoCuadrilatero.perimetro());
        
        /**
         * instrumentos 
         */
        InstrumentoMusical instrumento = new Flauta();
        instrumento.tocar();
        System.out.println(instrumento.tipoInstrumento());
    }

}