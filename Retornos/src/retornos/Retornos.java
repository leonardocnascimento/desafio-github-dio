/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retornos;

/**
 *
 * @author Leonardo
 */
public class Retornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /**
     * A execução do return se dá de três formas:
     * completa suas instruções internas;
     * chega a uma declaração explicita de retorno;
     * lança uma exceção (algum erro acontecer).
    */
    
        double areaQuadrado = Quadrilatero.area(10);
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        
        double areaRetangulo = Quadrilatero.area(5, 20);
        System.out.println("Área do retângulo: " + areaRetangulo);
        
                
        double areaTrapezio = Quadrilatero.area(5, 3, 2);
        System.out.println("Área do trapézio: " + areaTrapezio);
        
    }
    
}
