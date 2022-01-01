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
public class Quadrilatero {
    
    public static double area(double lado) {
        
        return lado * lado;
    
    }
    
    public static double area(double lado1, double lado2) {
        
        return lado1 * lado2;
    
    }
    
    public static double area(double baseMaior, double baseMenor, double altura) {
        
        return ((baseMaior + baseMenor) * altura) / 2;
    
    }
    
}
