public class CaixaArreia {
    public static void main(String[] args) {
        
        char letra = 'S';
        int contagem = 0;
        do{
           System.out.println(contagem);
            
           if (contagem >= 3){
                letra = 'N';
           }

           contagem++; 

        }while(letra == 'S');


    }
}
