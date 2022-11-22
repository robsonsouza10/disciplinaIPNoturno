import java.util.Scanner;

public class P2_Questao1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcaoVoto;
        int chapa1 = 0, chapa2 = 0, votoNulo = 0;

        do {
            System.out.println("______ Eleições Centro Acadêmico ______");
            System.out.println(" 1 - Voto em Chapa1 ");
            System.out.println(" 2 - Voto em Chapa2 ");
            System.out.println(" 3 - Voto Nulo  ");
            System.out.println(" 0 - Encerrar votação");
            System.out.print(" __ opção: ");
            
            opcaoVoto = teclado.nextInt();
            
            switch(opcaoVoto){
                case 1 : 
                        chapa1++;
                        break;
                case 2 : 
                        chapa2++;
                        break;
                case 3 : 
                        votoNulo++;
                        break;
                case 0 :
                        /* Encerra votação */
                        break;
                default : /* opção inválida*/
                        System.out.println("Opção incorreta");
                        break;  
            }
        }while(opcaoVoto != 0);
        
        int totalVotos = chapa1+chapa2+votoNulo;
        
        System.out.println("******* Resultados Eleições *******  ");
        System.out.println("Total de votos Chapa1: "+chapa1);
        System.out.println("Total de votos Chapa2: "+chapa2);
        System.out.println("Total de votos Nulos: "+votoNulo);
        System.out.println("Total Geral de votos: "+totalVotos);      
        

        teclado.close();
    
    }
}
