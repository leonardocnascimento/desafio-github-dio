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
public class Emprestimo {
         
    public static double taxaMensal() {
        
        return 0.89;
    
    }
           
    public static void calculandoTaxas(double valor, int parcelas) {
    
        
        double valorParcelado = valor / parcelas;
        double valorParcelaComTaxa = valorParcelado + (valor * taxaMensal() / 100);
           
        System.out.println("Empréstimo de R$ " + valor + " parcelado em " + parcelas + " fica com parcelas de R$ " + valorParcelaComTaxa);
            
        
    }
    
}
