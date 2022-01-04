package EstruturasDeRepeticao;

import java.util.Scanner;

public class EstruturasDeRepeticao {

    public static void main(String[] args) {
        /**Tipos:
         * while: expressao logica -> sequencia de codigo (retorna a expressão logica e verifica se foi true)
         * do while: sequencia de codigo -> expressao logica (a repeticao so ocorre apos a expressao logica for true, caso contrario, apenas faz a leitura da sequencia de codigo apenas uma vez)
         * for: iniciacao -> teste de expressao contada -> sequencia de codigo -> atualizacao -> retorna ao teste.
         */
        
        Ex1_NomeIdade();
        System.out.println("");

        Ex2_Notas();
        System.out.println("");

        Ex3_MaiorEMedia();
        System.out.println("");

        Ex4_ParOuImpar();
        System.out.println("");

    }
    
    private static void Ex1_NomeIdade () {
        /**programa para ler conjunto de dois valores
         * o primeiro valor sera o nome do aluno e o segundo a sua idade;
         * para parar o programa, o valor '0' (zero) deve ser inserido no campo nome.
         */

        Scanner scan = new Scanner(System.in); //variável para facilitar a leitura de dados inseridos pelo usuário.

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        
        System.out.println("Programa finalizado!");

    }

    private static void Ex2_Notas() {
        /**programa que pede uma nota de 0 a 10.
         * deve mostrar uma mensagem caso a nota seja invalida.
         * e continue pedindo ate o usuario inserir uma nota valida.
         */
        
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt(); 

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida, digite novamente: ");
            nota = scan.nextInt();
        }
          
        
    }

    private static void Ex3_MaiorEMedia() {
        /**programa que leia 5 numeros.
         * informe o maior numero;
         * informe a media desses numeros.
         */

        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int media = 0;
        int contador = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            media = media + numero;

            ++contador;
        } while (contador < 5);
        System.out.println("O maior numero: " + maior);
        System.out.println("A media: " + (media / 5));
        
    }

    private static void Ex4_ParOuImpar() {


    }

}
