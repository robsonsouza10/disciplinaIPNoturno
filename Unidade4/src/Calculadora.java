import java.util.Scanner;

/* Entradas:
             - numero 1
             - numero 2
             - operação

           Processo:
                - soma, subtração, multiplicação e
                divisão
           Saída:
                -   Resultado
         */

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Informe o 1º número: ");
        double numero1 = teclado.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("  Soma          [+]");
        System.out.println("  Subtração     [-]");
        System.out.println("  Multiplicação [*]");
        System.out.println("  Divisão       [/]");

        char operacao = teclado.next().charAt(0);

        System.out.println("Informe o 2º número:");
        double numero2 = teclado.nextDouble();

        boolean imprimirResultado = true;

        switch(operacao){
            case '+' : //soma
                        resultado = numero1 + numero2;
                        break;
            case '-' : //subtração
                        resultado = numero1 - numero2;
                        break;
            case '*' : //multiplicação
                        resultado = numero1 * numero2;
                        
                        break;
            case '/' : //divisão
                        
                        if (numero2 != 0){
                            resultado = numero1 / numero2;
                            System.out.println("Resultado: "+resultado);
                        }else{
                            imprimirResultado = false;
                            System.out.println("Não é possível dividir por zero");
                        }
                        
                        break;
            default : //opção inválida
                        imprimirResultado = false;
                        System.out.println("Opção inválida");
                        break;
        }

        if (imprimirResultado){
            System.out.println("Resultado: "+resultado);
        }
        
        teclado.close();

    }
}
