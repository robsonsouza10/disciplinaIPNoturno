import java.util.Scanner;

public class Prova2Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o tipo de tinta:");
        System.out.println("V) Verde - A) Azul B) Branca");
        char tipo = teclado.next().charAt(0);
        tipo = Character.toUpperCase(tipo);

        if (tipo == 'V'){
            System.out.println("Verde");
        }else{
            if (tipo == 'A'){
                System.out.println("Azul");
            }else {
                    if (tipo == 'B'){
                        System.out.println("Branca");
                    }else{
                        System.out.println("Tipo incorreto");
                    }
            }
        }
    }
}
