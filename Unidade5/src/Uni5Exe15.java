import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        //Entradas:  Nome aluno,nota1, nota2
        //processo: calculo da média
        //saída: média
        String nome = "";
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        //somente entra quando o nome do aluno for diferente de fim
        while(!nome.equals("fim")){
            //Entrada
            System.out.println("Informe o Nome do Aluno:");
            nome = teclado.next();
            if (!nome.equals("fim")){
                System.out.println("Informe a Nota1: ");
                nota1 = teclado.nextDouble();
                System.out.println("Informe a nota2: ");
                nota2 = teclado.nextDouble();
                //Processo

                media = (nota1 + nota2)/2;

                System.out.println("Aluno: "+ nome + " Média Final: "+media);
            }
        }

        teclado.close();
    }
}
