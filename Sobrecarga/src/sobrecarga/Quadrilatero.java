/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecarga;

/**
 *
 * @author Leonardo
 */
public class Quadrilatero {
    
    public static void area(double lado) {
        
        System.out.println("Área do quadrado: " + lado * lado);
    
    }
    
    public static void area(double lado1, double lado2) {
        
        System.out.println("Área do retângulo: " + lado1 * lado2);
        
    }
    
    public static void area(double baseMaior, double baseMenor, double altura) {
        
        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
        
    }
    
}
