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
public class Metodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    // Os exercícios de métodos serão 'rodados' por esse main.
        
    // Calculadora
        System.out.println("Calculadora das 4 operações básicas");
        Calculadora.soma(5, 30);
        Calculadora.subtracao(40, 5);
        Calculadora.multiplicacao(7,5);
        Calculadora.divisao(70,2);
        
    // Mensagens
        System.out.println("Sistema de mensagens pelo horário");
        Mensagem.mensagens(9);
        Mensagem.mensagens(15);
        Mensagem.mensagens(20);
        Mensagem.mensagens(25);
        
    // Serviço de empréstimo
        System.out.println("Calculando um empréstimo");
        Emprestimo.calculandoTaxas(1000, 10);
        
    }
    
}
