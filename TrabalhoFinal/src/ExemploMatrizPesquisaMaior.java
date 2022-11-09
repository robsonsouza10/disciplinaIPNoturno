public class ExemploMatrizMaior {

  private ExemploMatrizMaior() {
    final int matLin = 5, matCol = 5;
    int mat[][] = new int[matLin][matCol];

    matrizPreencherLinhaColuna(mat, matLin, matCol);
    matrizEscrever(mat, matLin, matCol);

    matrizPreencherColunaLinha(mat, matLin, matCol);
    matrizEscrever(mat, matLin, matCol);

    int vetAchou[] = matrizPesquisar(mat, matLin, matCol);
    if (vetAchou[0] != -1) {
      System.out.println("Achou na posição[" + vetAchou[0] + "," + vetAchou[1] + "].");
    }
  }

  private void matrizPreencherLinhaColuna(int mat[][], int matLin, int matCol) {
    int valor = 1;
    for (int l = 0; l < matLin; l++) { // linhas
      for (int c = 0; c < matCol; c++) { // colunas
        mat[l][c] = valor;
        valor++;
      }
    }
  }

  private void matrizPreencherColunaLinha(int mat[][], int matLin, int matCol) {
    int valor = 1;
    for (int c = 0; c < matCol; c++) { // colunas
      for (int l = 0; l < matLin; l++) { // linhas
        mat[l][c] = valor;
        valor++;
      }
    }
  }

  private void matrizEscrever(int mat[][], int matLin, int matCol) {
    System.out.print(" ");
    for (int i = 0; i < matCol - 1; i++) {
      System.out.print("------");
    }
    System.out.println();
    for (int l = 0; l < matLin; l++) {
      for (int c = 0; c < matCol; c++) {
        if (mat[l][c] < 10) { // 1 digito
          System.out.print("|  " + mat[l][c] + " ");
        } else { // 2 digitos
          System.out.print("| " + mat[l][c] + " ");
        }
      }
      System.out.println("|");
    }
    System.out.print(" ");
    for (int i = 0; i < matCol - 1; i++) {
      System.out.print("------");
    }
    System.out.println();
  }

  private int[] matrizPesquisar(int mat[][], int matLin, int matCol) {
    int valorPesquisar = 14;
    int vetAchou[] = { -1, -1 };

    for (int l = 0; l < matLin; l++) { // linhas
      for (int c = 0; c < matCol; c++) { // colunas
        if (valorPesquisar == mat[l][c]) {
          vetAchou[0] = l;
          vetAchou[1] = c;
          break;
        }
      }
    }
    return vetAchou;
  }

  public static void main(String[] args) {
    new ExemploMatrizMaior();
  }

}
