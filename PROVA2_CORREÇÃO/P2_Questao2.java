import java.util.Scanner;

public class P2_Questao2 {

  private P2_Questao2() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Tamanho do vetor: ");
    final int vetQtd = teclado.nextInt();

    int vetA[] = new int[vetQtd];
    int vetB[] = new int[vetQtd];
    int vetSoma[] = new int[vetQtd];

    vetLer(vetA, "VetA", teclado);
    vetLer(vetB, "VetB", teclado);
    vetSoma(vetA, vetB, vetSoma);
    vetOrdenar(vetSoma);
    vetEscrever(vetSoma);

    teclado.close();
  }

  private void vetLer(int vet[], String vetStr, Scanner teclado) {
    System.out.println(" __ Lendo o " + vetStr + " __");
    for (int i = 0; i < vet.length; i++) {
      System.out.print(vetStr + "[" + i + "]: ");
      vet[i] = teclado.nextInt();
    }
  }

  private void vetSoma(int vet1[], int vet2[], int vetSoma[]) {
    for (int i = 0; i < vetSoma.length; i++) {
      vetSoma[i] = vet1[i] + vet2[i];
    }
  }

  private void vetOrdenar(int vetSoma[]) {
    int bolha;
    for (int i = 0; i < vetSoma.length - 1; i++) {
      if (vetSoma[i] > vetSoma[i + 1]) {
        bolha = vetSoma[i];
        vetSoma[i] = vetSoma[i + 1];
        vetSoma[i + 1] = bolha;
        i = -1;
      }
    }
    System.out.println("_ valores ordenados.");
  }

  private void vetEscrever(int vetSoma[]) {
    System.out.println(" __ Resultado __");
    for (int i = 0; i < vetSoma.length; i++) {
      System.out.println("VetSoma[" + i + "]: " + vetSoma[i]);
    }
  }

  public static void main(String[] args) {
    new P2_Questao2();
  }
}
