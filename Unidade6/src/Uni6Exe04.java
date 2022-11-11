import java.util.Scanner;

public class Uni6Exe04 {
    
    private Uni6Exe04(){
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];
        
        lerVetor(vetor1, teclado, " ** Vetor1 ** ");
        lerVetor(vetor2, teclado," ** Vetor2 ** ");
        somaVetor(vetor1, vetor2, vetorSoma);

        imprimeVetores(vetor1, vetor2, vetorSoma);


        teclado.close();
 

    }

    private void lerVetor(int vetor[], Scanner teclado, String nomeVetor){
        System.out.println("Lendo o vetor: "+nomeVetor);
        for (int i = 0; i < vetor.length; i++){
            System.out.println("Vetor["+i+"]: ");
            vetor[i] = teclado.nextInt();
        }
    }

    private void somaVetor(int vetor1[], int vetor2[], int vetor3[]){
        for (int i = 0; i < vetor3.length; i++ ){
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }

    private void imprimeVetores(int vet1[], int vet2[], int vet3[]){
        System.out.println("*** Imprimindo Vetor1****");
        for (int i = 0; i < vet1.length; i++){
            System.out.println(" Vetor1["+i+"] = "+vet1[i]);
        }
        
        System.out.println("*** Imprimindo Vetor2****");
        for (int i = 0; i < vet2.length; i++){
            System.out.println(" Vetor2["+i+"] = "+vet2[i]);
        }

        System.out.println("*** Imprimindo Vetor3 - Soma ****");
        for (int i = 0; i < vet3.length; i++){
            System.out.println(" Vetor3["+i+"] = "+vet3[i]);
        }

    }

    public static void main(String[] args) {
        new Uni6Exe04();    
    }
}
