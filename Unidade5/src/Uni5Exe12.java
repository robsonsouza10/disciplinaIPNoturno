import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o número de linhas(n):");
        int n = teclado.nextInt();
        int floyd = 1;
        String espacos = "";
        //linhas
        for (int linha = 1; linha <= n;linha++){
            for(int coluna = 1; coluna <= linha; coluna++){
                if (floyd < 10){
                    espacos = "   ";
                }else
                if (floyd < 100){
                    espacos = "  ";
                }else 
                if (floyd < 1000){
                    espacos = " ";
                }

                System.out.print(floyd + espacos);

                floyd++;
            }
            System.out.println("");
        }

        teclado.close();
    }
}
