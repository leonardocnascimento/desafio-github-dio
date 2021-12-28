/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variaveis1;

/**
 *
 * @author Leonardo
 */
public class Variaveis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // exercitando aula - conceituação e criação de variáveis.
        
        int i;
        // int i; não podemos ter duas variáveis com mesmo nome.
        
        int I;
        
        // int 1a; não se inicia variáveis com número.
        
        int _1a; //pelas boas práticas, não é indicado iniciar com caracteres especiais.
        int $aq; //pelas boas práticas, não é indicado iniciar com caracteres especiais.
        
        i = 5;
        I = 10;
        _1a = 30;
        $aq = 7;
        
        final int j = 10;
        // j = 15; como o comando 'final' define uma constante para variável, não podemos alterar posteriormente.
        
        int asrn24678md;
        int asrn2$4678_md = 10; //pelas boas práticas, não é indicado colocar caracteres especiais para espaço.
        // int asrn2$4%678_md = 10; além do exemplo anterior, o '%' não pode ser utilizado.
        
        asrn24678md = 100;
        
        int quantidadeDeProduto = 50;
        
        // int QuantidadeDeProduto; pelas boas práticas, é indicado iniciar variáveis por letra minúscula.
        
        final int NUMERO_TENTATIVAS = 5; // utilizando a boa prática quando nomeado uma variável 'final'.
        // final int numeroTentativas = 5;
        
        int QUANTIDADE_OPCOES = 25; // Não é uma boa prática nomear variável assim sem ser um 'final'.
        //int qtdProd; Não é uma boa prática nomear sem expressividade.
        
        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        
        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);
        
        System.out.println(quantidadeDeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);
                
    }
    
}
