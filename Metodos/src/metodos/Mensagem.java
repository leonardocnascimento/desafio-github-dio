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
public class Mensagem {
    
    public static void mensagens(int hour) {
    
        switch (hour) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                
                mensagemDeBomDia();
                break;
            
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                
                mensagemDeBoaTarde();
                break;
                
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                
                mensagemDeBoaNoite();
                break;
            
            default:
                System.out.println("Hora inválida");
                break;
        }
    
    }
    
    public static void mensagemDeBomDia() {
        
        System.out.println("Bom dia!");
    
    }
    
    public static void mensagemDeBoaTarde() {
        
        System.out.println("Boa tarde!");
    
    }
    
    public static void mensagemDeBoaNoite() {
        
        System.out.println("Boa noite!");
    
    }
    
}
