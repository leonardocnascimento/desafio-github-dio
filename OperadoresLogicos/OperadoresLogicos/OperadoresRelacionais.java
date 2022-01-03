package OperadoresLogicos;

public class OperadoresRelacionais {

    public static void main(String[] args) {
        /** Relacionais de similaridade:
         * Igualdade: determina se o operando é igual ao outro; simbolo '==';
         * Diferença: determina se o operando não é igual ao outro; simbolo '!='.
         * */

         /** Relacionais de tamanho:
          * Maior: '>' ;
          * Maior igual: '>='; 
          * Menor: '<'
          * Menor igual: '<='*/

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Leonardo";
        String s2 = "Leonardo";
        String s3 = "Jose";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8997L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("10 == 20 " + (i1 == i2));
        System.out.println("10 != 20 " + (i1 != i2));
        System.out.println("10 > 20 " + (i1 > i2));
        System.out.println("10 >= 20 " + (i1 >= i2));
        System.out.println("10 < 20 " + (i1 < i2));
        System.out.println("10 <= 20 " + (i1 <= i2));

        System.out.println("4,5 == 3,5 " + (f1 == f2));
        System.out.println("4,5 != 3,5 " + (f1 != f2));
        System.out.println("4,5 > 3,5 " + (f1 > f2));
        System.out.println("4,5 >= 3,5 " + (f1 >= f2));
        System.out.println("4,5 < 3,5 " + (f1 < f2));
        System.out.println("4,5 <= 3,5 " + (f1 <= f2));
        System.out.println("59,6d >= 4,5f " + (d1 >= f1));
        
        System.out.println("x == y " + (c1 == c2));
        System.out.println("x != y " + (c1 != c2));
        System.out.println("x > y " + (c1 > c2));
        System.out.println("x >= y " + (c1 >= c2));
        System.out.println("x < y " + (c1 < c2));
        System.out.println("x <= y " + (c1 <= c2));

        System.out.println("Leonardo == Leonardo " + (s1 == s2));
        System.out.println("Leonardo == Jose " + (s1 == s3));
        System.out.println("Leonardo != Leonardo " + (s1 != s2));
        System.out.println("Leonardo == Jose " + (s2 != s3));
        //System.out.println("Leonardo > Leonardo " + (s1 > s2)); relacionais de tamanho não funcionam em Strings nem booleanos.
        //System.out.println("Leonardo >= Jose " + (s1 >= s3)); relacionais de tamanho não funcionam em Strings nem booleanos.

        System.out.println("true == false " + (b1 == b2));
        System.out.println("true != false " + (b1 != b2));
        
        System.out.println("1597L == 8997L " + (l1 == l2));
        System.out.println("1597L != 8997L " + (l1 != l2));
        System.out.println("1597L > 8997L " + (l1 > l2));
        System.out.println("1597L >= 8997L " + (l1 >= l2));
        System.out.println("1597L < 8997L " + (l1 < l2));
        System.out.println("1597L <= 8997L " + (l1 <= l2));

        System.out.println("1 == 25 " + (y1 == h1));
        System.out.println("1 != 25 " + (y1 != h1));
        System.out.println("1 > 25 " + (y1 > h1));
        System.out.println("1 >= 25 " + (y1 >= h1));
        System.out.println("1 < 25 " + (y1 < h1));
        System.out.println("1 <= 25 " + (y1 <= h1));

    }
    
}
