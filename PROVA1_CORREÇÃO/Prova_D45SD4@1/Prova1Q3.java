import java.util.Scanner;

public class Prova1Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tipo de tinta:");
        System.out.println("A) Azul - V) Vermelha P) Preta");
        char tipo = teclado.next().charAt(0);
        tipo = Character.toUpperCase(tipo);

        if (tipo == 'A'){
            System.out.println("Azul");
        }else{
            if (tipo == 'V'){
                System.out.println("Vermelho");
            }else {
                    if (tipo == 'P'){
                        System.out.println("Preta");
                    }else{
                        System.out.println("Tipo incorreto");
                    }
            }
        }
    }
}
