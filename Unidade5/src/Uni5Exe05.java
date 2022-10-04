import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de Termos:" );
        int n = teclado.nextInt();
        int termo = 8, termoAnterior = 8;
        String termoFinal = "";

        if (n > 2){
            for (int contador = 1; contador <= n; contador++){
                if (contador > 1){
                    termoFinal += ", ";
                }

                termoFinal += termo;         
                
                if (contador % 2 == 0){ //o contador é par
                    //multiplicação do termo anterior por 2
                    termo = termoAnterior * 2;
                }else{
                   //soma por 2 
                   termoAnterior = termo;
                   termo += 2;                        
                }        
            }
            
            System.out.println(termoFinal);
        }else{
            System.out.println("O número informado deve ser > que 2");
        }
        


        teclado.close();
    }
}
