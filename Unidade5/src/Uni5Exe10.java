public class Uni5Exe10 {
    public static void main(String[] args) {
        
        int soma = 0, potencia = 0, contador = 0;
        String termoFinal = "";

        for(int termo1 = 0; termo1 <= 10000; termo1++){
            for (int termo2 = 0; termo2 <= 10000;termo2++){
                soma = termo1 + termo2;
                potencia = soma * soma;

                termoFinal = termo1 + "" + termo2;

                if (termoFinal.equals(potencia+"")){
                    contador++;
                    System.out.println("["+contador+"]"+termo1 + " + " + termo2 + " = "+ soma+ " -> "+ soma + "² = "+potencia);
                    
                    //parar o laço de repetição
                    /*if(contador >= 10){
                        termo1 = 10001;
                        termo2 = 10001;
                    }*/
                    //parar o laço de repetição
                    if(contador >= 10){
                        break;
                    }
  
                }
                
                 //parar o laço de repetição
                if(contador >= 10){
                    break;
                }    

            }
        }

    }    
}
