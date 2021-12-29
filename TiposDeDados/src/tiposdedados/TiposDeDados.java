/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposdedados;

/**
 *
 * @author Leonardo
 */
public class TiposDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //exercitando tipos de dados, muitos exemplos demonstram o número máximo negativo e positivo dos tipos de dados.
        
        byte firstByte = -128;
        byte lastByte = 127;
        
        short firstShort = -32768;
        short lastShort = 32767;
        
        int firstInt = -2147483648;
        int lastInt = 2147483647;
        
        long firstLong = -9223372036854775808L;
        long lastLong = 9223372036854775807L;
        
        float firstFloat = -340282347f; //elevado à 38.
        float lastFloat = 340282347f; //elevado à 38.
        
        double firstDouble = -179769313486231570d; //elevado à 308.
        double lastDouble = 179769313486231570d; //elevado à 308.
        
        char firstChar = 'A';
        char lastChar = 'Z';
        
        String firstName = "Leonardo";
        String lastName = "Nascimento";
        
        boolean verdadeiro = true;
        boolean falso = false;
        
        //impressão das variáveis determinadas nos tipos de dados vistos em aula.
        
        System.out.println(firstByte);
        System.out.println(lastByte);
        
        System.out.println(firstShort);
        System.out.println(lastShort);
        
        System.out.println(firstInt);
        System.out.println(lastInt);
        
        System.out.println(firstLong);
        System.out.println(lastLong);
        
        System.out.println(firstFloat);
        System.out.println(lastFloat);
        
        System.out.println(firstDouble);
        System.out.println(lastDouble);
        
        System.out.println(firstChar);
        System.out.println(lastChar);
        
        System.out.println(firstName);
        System.out.println(lastName);
        
        System.out.println(verdadeiro);
        System.out.println(falso);
        
    }
    
}
