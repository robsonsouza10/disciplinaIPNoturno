import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a quantide de números:");
        int n = teclado.nextInt();
        double numeroN = 0, maiorValor = 0, menorValor = 0;

        for (int contador = 1; contador <= n; contador++){
            System.out.println("Informe um número do tipo Real ("+contador+" º):");
            numeroN = teclado.nextDouble();

            if (contador == 1){ //primeira vez que está entrando
                maiorValor = numeroN;
                menorValor = numeroN;
            }else{
                if (numeroN < menorValor){
                    menorValor = numeroN;
                }

                if (numeroN > maiorValor){
                    maiorValor = numeroN;
                }
            }



        }

        System.out.println("O maior valor informado foi: "+maiorValor);
        System.out.println("O menor valor informado foi: "+menorValor);

        teclado.close();
    }
}
