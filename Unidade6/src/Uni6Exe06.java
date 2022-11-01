import java.util.Scanner;

public class Uni6Exe06 {
    //construtor
    private Uni6Exe06(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor (N):");
        int tamanhoN = teclado.nextInt();

        double vetor[] = new double[tamanhoN];

        //método leitura do vetor 
        lerVetor(teclado, vetor);
        //método para fazer a pesquisa de valor
        
        //opção A
        boolean encontrou = pesquisarValor(teclado, vetor);
        if (encontrou){
            System.out.println("Encontrou...");
        }else{
            System.out.println("Não encontrou...");
        }

        //Opção B
       /*
         if (pesquisarValor(teclado, vetor)){
            System.out.println("Encontrou...");
        }else{
            System.out.println("Não encontrou...");
        }
        */


        teclado.close();

    }

    private void lerVetor(Scanner tec, double vet[]){
        for (int i = 0; i < vet.length; i++){
            System.out.println("Informe o valor["+i+"]: ");
            vet[i] = tec.nextDouble();
        }
    } 

    private boolean pesquisarValor(Scanner tec, double vet[]){
        System.out.println("Informe um valor para pesquisa:");
        double valorPesquisa = tec.nextDouble();
        
        for (int i = 0; i < vet.length; i++){
            if (vet[i] == valorPesquisa){
                return true;
            }
        }        
        return false;
    }


    public static void main(String[] args) {
       new Uni6Exe06();   

    }
}
