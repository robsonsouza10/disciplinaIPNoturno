import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcaoVoto;
        int candidato1 = 0, candidato2 = 0,
            candidato3 = 0, candidato4 = 0,
            votoNulo = 0, votoBranco = 0;


        do {
            System.out.println("Informe a opção de voto:");
            System.out.println(" 1 - Candidato1 ");
            System.out.println(" 2 - Candidato2 ");
            System.out.println(" 3 - Candidato3 ");
            System.out.println(" 4 - Candidato4 ");
            System.out.println(" 5 - Voto Nulo  ");
            System.out.println(" 6 - Voto Branco  ");
            System.out.println(" 0 - Encerrar votação");
            opcaoVoto = teclado.nextInt();
            
            switch(opcaoVoto){
                case 1 : 
                        candidato1++;
                        break;
                case 2 : 
                        candidato2++;
                        break;
                case 3 : 
                        candidato3++;
                        break;
                case 4 : 
                        candidato4++;
                        break;
                case 5 : 
                        votoNulo++;
                        break;
                case 6 :
                        votoBranco++;
                        break;
                case 0 :
                        /* Encerra votação */
                        break;
                default : /* opção inválida*/
                        System.out.println("Opção Incorreta");
                        break;  
            }
        }while(opcaoVoto != 0);
        
        double totalVotos = candidato1+candidato2+candidato3+candidato4+
        votoNulo+votoBranco;

        double percentualNulo = (votoNulo*100)/totalVotos;
        double percentualBranco = (votoBranco*100)/totalVotos; 

        System.out.println("Total de votos Candidato1: "+candidato1);
        System.out.println("Total de votos Candidato2: "+candidato2);
        System.out.println("Total de votos Candidato3: "+candidato3);
        System.out.println("Total de votos Candidato4: "+candidato4);
        System.out.println("Total de votos Nulos: "+votoNulo);
        System.out.println("Total de votos Branco: "+votoBranco);
        System.out.println("Percentual (%) votos Nulos: "+percentualNulo);
        System.out.println("Percentual (%) votos Branco: "+ percentualBranco);
        
        

        teclado.close();
    
    }
}
