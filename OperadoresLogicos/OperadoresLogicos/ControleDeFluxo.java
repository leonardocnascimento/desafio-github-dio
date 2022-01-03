package OperadoresLogicos;

public class ControleDeFluxo {
    /**Tipos:
     * Decisao: if, if-else, if-else-if, switch e operador ternario;
     * Repeticao: for, while, do while;
     * Interrupcao: break, continue, return.
     */

    //so serao vistos operadores logicos de decisao: if(se), switch(escolha) e operador ternario.

    //exemplos da aula 3:
    public static void main(String[] args) {
        
        ifFlecha();
        System.out.println("");
        
        ifSemFlecha();
        System.out.println("");
        
        ifFerias();
        System.out.println("");
        
        ifMenor();
        System.out.println("");

        switchSemana();
        System.out.println("");

        switchFerias();

    }

    private static void ifFlecha() { //não é muito indicado o efeito flecha.

        int mes = 9;
        
        if(mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Marco");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mes invalido!");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }

    private static void ifSemFlecha() {

        int mes = 9;
        
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Marco");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mes invalido");
        }

    }

    private static void ifFerias() { // não é recomendada também o uso de várias condições em um único if. seria ideal fazer um switch.

        String mes = "Julho";

        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Ferias!");
        }
        
    }

    private static void ifMenor() {
        
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        //if grande e não recomendado:
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("O funcionario deve receber auxilio.");
        } else {
            System.out.println("O funcionario nao tem direito ao auxilio");
        }

        //diminuindo a complexidade e extensão do if

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("O funcionario deve receber auxilio");
        } else {
            System.out.println("O funcionario nao tem direito ao auxilio");
        }

        //otimizando o tamanho e complexidade do if anterior.

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if (recebeAuxilio) {
            System.out.println("O funcionario deve receber auxilio");
        } else {
            System.out.println("O funcionario nao tem direito ao auxilio");
        }

    }

    private static void switchSemana() {
        
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terca-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido!");
                break;
        }
    }

    private static void switchFerias() {
        
        String mes = "Dezembro";

        switch (key) {
            case "Dezembro":
            case "Janeiro":
            case "Julho":
                System.out.println("Ferias!");                
                break;
        
            default:
                System.out.println("Mes indefinido ou sem ferias!");
                break;
        }

    }
    
}
