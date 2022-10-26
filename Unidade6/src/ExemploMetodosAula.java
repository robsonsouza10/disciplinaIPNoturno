import java.util.Scanner;

public class ExemploMetodos {

    //construtor

    private  ExemploMetodos(){
        Scanner teclado = new Scanner(System.in);
        int tamanhoVetor = 5 ;
        //int novoVetor[] = {4,5,100};//3
        //String nome[] = {"Robson", "Teste"};//2
        int meuVetor[] = new int[tamanhoVetor];


        System.out.println(" tamanho Vetor (antes):"+tamanhoVetor);

        lerVetor(teclado, meuVetor, tamanhoVetor);

        System.out.println(" tamanho Vetor (depois):"+tamanhoVetor);

        imprimir(meuVetor);
        teclado.close();
    }

    //Meus Métodos

    //visibilidade - sem retorno void 
    private void lerVetor(Scanner tec, int vetor[], int tamanho){
        for (int i = 0; i < vetor.length; i++ ){
            System.out.println("Informe o elemento "+(i+1)+": posicao vetor["+i+"]");
            vetor[i] = tec.nextInt();
        }

        tamanho = 10;
    
    }

    private void imprimir(int vetor[]){
        for (int i = 0; i < vetor.length;i++){
            System.out.println(vetor[i]);
        } 
    }

    public static void main(String[] args) {
        new ExemploMetodos();
    }
}
