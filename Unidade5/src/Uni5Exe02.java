public class Uni5Exe02 {
    public static void main(String[] args) {
        //Descreva um algoritmo que calcule
        // e escreva a soma dos números pares 
        //e a soma dos números ímpares entre 1 e 100. 

        int somaPar = 0, somaImpar = 0;

        for(int contador = 1; contador <= 100; contador++){

            if (contador % 2 == 0){ //par
               somaPar = somaPar + contador; 
            }else{//impar
                somaImpar += contador; 
            }
        }

        System.out.println("A soma dos pares é: "+somaPar);
        System.out.println("A soma dos impares é: "+somaImpar);

    }
}
