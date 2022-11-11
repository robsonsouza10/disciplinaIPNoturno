import java.util.Scanner;
import java.util.Vector;

public class Uni6Exe10 {
    
    private Uni6Exe10(){
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[50];
        int posVetor = 0;
        int opcao;
        int indicePesquisa;
        do{
            //Opções de Menu

            System.out.println("____ MENU ____");
            System.out.println("1 – Incluir valor");
            System.out.println("2 – Pesquisar valor");
            System.out.println("3 – Alterar valor");
            System.out.println("4 – Excluir valor");
            System.out.println("5 – Mostrar valores");
            System.out.println("6 – Ordenar valores");
            System.out.println("7 – Inverter valores");
            System.out.println("8 – Sair do sistema");
            
            opcao = teclado.nextInt();


            switch(opcao){
                case 1: 
                        System.out.println("*** Inclusão de Valores ***"); 
                        posVetor = incluirValor(vetor, posVetor,teclado);
                        break;
                case 2: 
                    System.out.println("*** Pesquisa de Valores ***"); 
                    indicePesquisa = pesquisaValor(teclado,vetor,posVetor)
                    if (indicePesquisa != -1){
                        //encontrou o valor
                        System.out.println("O valor informado está na posição vetor["+indicePesquisa+"].");

                    }
                case 3 : //alteração 
				    System.out.println("*** Alteração de Valores ***"); 
                    indicePesquisa = pesquisaValor(teclado,vetor,posVetor)
                    if (indicePesquisa != -1){
                        //encontrou o valor
                        System.out.println("Informe o novo Valor:");
                        
                        vetor[indicePesquisa] = teclado.nextInt(); 
                    }
                    break;
			    case 4 : //Excluir Valor Implementar 
				    
                    break;
				case 5 : //Mostrar Valores Implementar 
				    
                    break;
				case 6 : //Ordenar Valor Implementar 
				    
                    break;
				case 7 : //Inverter Valor Implementar 
				    
                    break;
				case 8 : //Sair Sistema
				    
                    break;
				
            }
            

        }while(opcao != 8);

        teclado.close();
    }

    private int incluirValor(int vetor[], int posVetor, Scanner teclado){
        if (posVetor < vetor.length){
            System.out.println("Informe um valor para inclusão:");
            vetor[posVetor] = teclado.nextInt();
            System.out.println("Valor: "+vetor[posVetor] + " foi adicionado na posição vetor["+posVetor+"]");
            posVetor++;

        }else{
            System.out.println("Vetor está cheio, valor não foi adicionado.");
        }

        return posVetor;
    }

    private int pesquisaValor(Scanner teclado, int vetor[], int posVetor){
        System.out.println("Informe um valor:");
        int valorPesquisa = teclado.nextInt();
        for(int i = 0; i < posVetor; i ++){
            if (valorPesquisa == vetor[i]){
                return i;          
            }
        }

        return -1;
    } 

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
