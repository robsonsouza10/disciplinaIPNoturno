public class ExemploMatrizPesquisa {

  private ExemploMatrizPesquisa() {
    final int qtdLinha = 3; // linha
    final int qtdColuna = 5; // coluna
    int matriz[][] = new int[qtdLinha][qtdColuna];
    // inicializa TUDO com zero
    matriz[1][3] = 20;
    if (!matrizPesquisa(matriz,qtdLinha,qtdColuna)) {
      System.out.println("não achou");
    }
  }

  private boolean matrizPesquisa(int matriz[][],int qtdLinha, int qtdColuna) {
    for (int l=0; l<qtdLinha;l++){
      for (int c=0;c<qtdColuna;c++){        
        if (matriz[l][c] == 20) {
          System.out.println("["+l+"]["+c+"]");
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    new ExemploMatrizPesquisa(); // chamar método contrutor.
  }
}
