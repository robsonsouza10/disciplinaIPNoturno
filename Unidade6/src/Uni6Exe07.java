import java.util.Scanner;

public class Uni6Exe07 {
   
    private Uni6Exe07(){
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor;

        do{
            System.out.println("Informe o tamanho do vetor(N):");
            tamanhoVetor = teclado.nextInt();
        }while(tamanhoVetor < 1 || tamanhoVetor > 20);

        int vetor[] = new int[tamanhoVetor];



        teclado.close();

    }
   
    public static void main(String[] args) {
        new Uni6Exe07();
   } 
}
