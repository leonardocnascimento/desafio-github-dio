/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Leonardo
 */
public class Calculadora {
    
    public static void soma(double sum1, double sum2) {
        
        double resultSum = sum1 + sum2;
        
        System.out.println("A soma entre " + sum1 + " e " + sum2 + " é igual a " + resultSum);
        
    }
    
    public static void subtracao(double sub1, double sub2) {
    
        double resultSub = sub1 - sub2;
        
        System.out.println("A subtração entre " + sub1 + " e " + sub2 + " é igual a " + resultSub);
        
    }
    
    public static void multiplicacao(double mult1, double mult2) {
        
        double resultMult = mult1 * mult2;
        
        System.out.println("A multiplicação entre " + mult1 + " e " + mult2 + " é igual a " + resultMult);
    
    }
    
    public static void divisao(double div1, double div2) {
        
        double resultDiv = div1 / div2;
        
        System.out.println("A divisão entre " + div1 + " e " + div2 + " é igual a " + resultDiv);
    
    }
    
}
