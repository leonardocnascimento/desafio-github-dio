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
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Exercício de sobrecarga em métodos.
        
        System.out.println("Áreas dos quadriláteros:");
        Quadrilatero.area(5);
        Quadrilatero.area(2, 5);
        Quadrilatero.area(5, 3, 2);
    
    }
    
}
