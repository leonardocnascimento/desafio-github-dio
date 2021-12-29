/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Leonardo
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //exercitando o exercício da aula de operadores aritméticos.
        
        System.out.println("Préfixado e Pós-Fixados");
        prePosFixados();
        
        System.out.println("Operadores convencionais");
        operadoresAritmeticos();
        
        System.out.println("Atribuições de operadores");
        atribuicoes();
        
        System.out.println("Ordem de precedencias dos operadores");
        precedencia();
        
    }
    
    private static void prePosFixados(){
    
    //aplicando pré-fixados e pós-fixados.
        
        int firstNumber = 10;
        
        int preFixed = ++firstNumber;
        int posFixed = firstNumber--;
        int result = firstNumber;
        
        System.out.println("Pre-fixado: " + preFixed);
        System.out.println("Pos-Fixados: " + posFixed);
        System.out.println("Conferencia da variavel: " + result);
            
    }
    
    private static void operadoresAritmeticos() {
    
    //Operações de soma, subtração, multiplicação, divisão e resto da divisão.
        
        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;
        int numberFour = 40;
        int numberFive = 50;
        
        int resultSum = numberFive + numberThree; //soma.
        int resultSub = numberFour - numberTwo; //subtração.
        int resultMult = numberOne * numberFive; //multiplicação.
        int resultDiv = numberThree / numberOne; //divisão.
        int resultRest = numberFour % numberTwo; //resto da divisão.
        
        System.out.println("Resultado da Soma: " + resultSum);
        System.out.println("Resultado da Subtração: " + resultSub);
        System.out.println("Resultado da Multiplicação: " + resultMult);
        System.out.println("Resultado da Divisão: " + resultDiv);
        System.out.println("Resultado do Resto da Divisão: " + resultRest);
    
    }
    
    private static void atribuicoes() {
    
    //Atribuições compostas de operações para diminuição de código.
        
        int firstInt = 1500;
        short numberShort = 15;
        long numberLong = 500L;
        int secondInt = 35;
        float numberFloat = 3.5f;
        double numberDouble = numberFloat;
        
        System.out.println("Número Double: " + numberDouble); //verificação se houve a atribuição correta do Double.
        
        firstInt += 5; //firstInt = firstInt + 5.
        numberShort -= 3; //numberShort = numberShort - 3.
        numberDouble /= 2.7d; //numberDouble = numberDouble / 2.7.
        numberLong *= 3; //numberLong = numberLong * 3.
        secondInt %= 2; //secondInt = secondInt % 2.
        
        System.out.println("Resultado de 1500 + 5: " + firstInt);
        System.out.println("Resultado de 15 - 3: " + numberShort);
        System.out.println("Resultado de 3.5 / 2.7: " + numberDouble);
        System.out.println("Resultado de 500 * 3: " + numberLong);
        System.out.println("Resultado de 35 % 2: " + secondInt);
        
                      
    }
    
    private static void precedencia() {
    
    //exemplos para verificação de precedência de pré e pós-fixados, operações aritméticas e atribuições compostas.
        
        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;
        
        int firstExemple = numberOne++ + --numberTwo * numberThree; // 10 + 19 * 30 -> 10 + 570 -> 580.
        
        System.out.println("Resultado do primeiro exemplo 10++ + --20 * 30: " + firstExemple);
        System.out.println("Resultado do 10++ após o cálculo feito: " + numberOne); //11.
        
        int secondExemple = numberThree / --numberOne % 3 + 1; // 30 / '10' que volta ao seu valor original % 3 + 1 -> 1.
        
        System.out.println("Resultado de 30 / --11 % 3 + 1: " + secondExemple);
        System.out.println(numberOne); //10.
        
        int thirdExemple = 2;
        
        thirdExemple *= numberOne += 5; // 2 * 10 + 5 -> 2 * 15 -> 30.
        
        System.out.println("Resultado de 2 * 10 + 5: " + thirdExemple); //cuidado pois as precedências matemáticas não são as mesmas das precedências em Java.
        
    }
    
    
}
