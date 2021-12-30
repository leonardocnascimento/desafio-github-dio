/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversoescasting;

/**
 *
 * @author Leonardo
 */
public class ConversoesCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    /**DownCast sempre é explícito, com isso deve-se indicar para qual tipo deve ser 
     * diminuida sua capacidade, segue exemplos abaixo.
     */
        
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;
        
        System.out.println("DownCast short = 1000 para byte = " + b1);
        
        int i1;
        long l1 = 1000000000000000000L;
        i1 = (int)l1;
        
        System.out.println("DownCast long = 1000000000000000000 para int = " + i1);
        
        float f1;
        double d1 = 10000.58d;
        f1 = (float) d1;
        
        System.out.println("DownCast double = 10000.58 para float = " + f1);
        
        
     /**UpCast é implícito, com isso não tem necessidade de indicar para qual tipo deve ser 
     * aumentada sua capacidade e não há perda de informação, segue exemplos abaixo.
     */   
        
        long l2;
        int i2 = 10;
        l2 = i2;
        
        System.out.println("UpCast int = 10 para long = " + l2);
        
        double d2;
        float f2 = 10.5f;
        d2 = f2;
        
        System.out.println("UpCast float = 10.5 para double = " + d2);       
     
    }
    
}
