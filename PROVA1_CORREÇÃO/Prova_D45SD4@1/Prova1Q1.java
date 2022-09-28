public class Prova1Q1 {
  public static void main(String[] args) {
    String temperatura = "Baixa";
    String clima = "seco";

    if (temperatura.equals("") && clima.equals("")){
        System.out.println("Temperatura e clima");
    }else{
        System.out.println("Teste clima");

        if (clima.equals("")){
            System.out.println("Clima vazio");
            System.out.println("Temperatura vazia");
        }else{
            System.out.println("Clima Cadastrado");
        }
    }

    System.out.println("..FINALIZADO..");
  }  
}
