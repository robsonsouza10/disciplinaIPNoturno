import java.util.Scanner;

public class Uni6Exe02 {

    //construtor da classe
    private Uni6Exe02(){
        //todo código
        Scanner tec = new Scanner(System.in);

        double mediaElementos = 0;
        double vetor[] = new double[12];
        lerValores(tec, vetor);
        
        mediaElementos = calcularMedia(vetor);

        imprimeValoresMaiorMedia(vetor, mediaElementos);

        tec.close();
    } 

    private void lerValores(Scanner teclado, double vet[]){
        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe o elemento vetor["+i+"]:");
            vet[i] = teclado.nextDouble();
        }
    }

    private double calcularMedia(double vet[]){
        double somaValores = 0;
        for (int i = 0; i < vet.length; i++){
          somaValores += vet[i];    
        }

        double media = somaValores/vet.length;
                
        return media;

    }

    private void imprimeValoresMaiorMedia(double vet[], double media){
        System.out.println("**** Valores Maior que Média **** ");
        System.out.println(" A média é: "+media);
        System.out.println("*********************************");

        for (int i = 0; i < vet.length; i++){
            //comparar se valor do elemento é maior média
            if (vet[i] > media){
                System.out.println(" vetor["+i+"]: "+vet[i]);
            }
        }
    }

    public static void main(String[] args) {
        //instancia 
        new Uni6Exe02();
    }
}
