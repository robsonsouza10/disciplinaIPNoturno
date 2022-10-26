import java.util.Scanner;

public class Exemplo {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int tamanhoVetor = 5;
	/*Uso da palavra reservada final antes do tipo da varíavel indica
	que somente poderar ser atribuído valor para a variável uma única vez
	
	//final tamanhoVetor = 5;
	
	*/
	
    
	int meuVetor[] = new int[tamanhoVetor];

	/*É possível atribuir valores fixos no código para as posições do vetor,
		o vetor abaixo possui tamanho 3, e no indice 0 está o valor 50, no
		indice 1 esta o valor 100 e no indice 2 está o valor 80
		
		int meuVetorTeste[] = {50,100,80};
	*/

    for (int i = 0; i <= meuVetor.length; i++ ){
        System.out.println("Informe o elemento "+(i+1)+": posicao vetor["+i+"]");
        meuVetor[i] = teclado.nextInt();
    }


   /*meuVetor[0] = 10;
    meuVetor[1] = 5;
    meuVetor[2] = 6;
*/
    for (int i = 0; i < meuVetor.length;i++){
        System.out.println(meuVetor[i]);
    }


    teclado.close();


  }  
}
