package OperadoresLogicos;

public class OperadoresLogicos {

    public static void main(String[] args) {
        /**Tipos:
         * Conjunção: operação lógica que só é verdadeira se ambos os operandos ou expressões envolvidas sejam verdade. simbolo: '&&' - terminologia and(E);
         * Disjunção: operação lógica que só é falsa se ambos os operandos ou expressões envolvidas sejam falsa. simbolo: '||' - terminologia or(OU);
         * Disjunção exclusiva: operação que só é verdade quando ambos os operandos ou expressões envolvidas são opostas. simbolo '^' - terminologia xor;
         * Negação: operação que inverte o valor lógico de um operando ou expressão. simbologia '!' - terminologia inversão(NOT).
         */

        //exemplos básicos.
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("Tabela Verdade (AND)");
        System.out.println("V e V = " + (b1 && b3));
        System.out.println("V e F = " + (b1 && b2));
        System.out.println("F e V = " + (b4 && b1));
        System.out.println("F e F = " + (b2 && b4));
        
        System.out.println("");

        System.out.println("Tabela Verdade (OR)");
        System.out.println("V e V = " + (b1 || b3));
        System.out.println("V e F = " + (b1 || b2));
        System.out.println("F e V = " + (b4 || b1));
        System.out.println("F e F = " + (b2 || b4));

        System.out.println("");

        System.out.println("Tabela Verdade (XOR)");
        System.out.println("V e V = " + (b1 ^ b3));
        System.out.println("V e F = " + (b1 ^ b2));
        System.out.println("F e V = " + (b4 ^ b1));
        System.out.println("F e F = " + (b2 ^ b4));

        System.out.println("");

        System.out.println("Tabela Negacao (NOT)");
        System.out.println("V = " + (!b1));
        System.out.println("F = " + (!b2));

        System.out.println("");
        
        System.out.println("exercicios intermediários");
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((10 + 5) < (50.0 - 20.0)) && verdadeiro = " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(10 > 20) || (50.0 < 20.0) " + ((i1 > i2) || (f2 < f1)));

        System.out.println("");

        System.out.println("exemplo de boas praticas");
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        System.out.println("");

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        System.out.println("");
        
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("Recebe auxilio: " + recebeAuxilio);
     
    }
    

}
