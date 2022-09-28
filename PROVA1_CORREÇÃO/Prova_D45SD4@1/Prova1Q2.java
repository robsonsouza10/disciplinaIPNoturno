import java.util.Scanner;

public class Prova1Q2 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);

       System.out.println("Informe o valor da compra:");
       double valorCompra = teclado.nextDouble();

       System.out.println("Escolha a forma de pagamento:");
       System.out.println("1 - Débito");
       System.out.println("2 - Pix");
       System.out.println("3 - Crediário");
       int opcaoPagamento = teclado.nextInt();
       double valorPagar = 0;
       double desconto = 0;

       switch(opcaoPagamento){
            case 1: //débito
                    valorPagar = valorCompra;
                    System.out.println("Valor a pagar:"+valorPagar);
                    break;
            case 2: //Pix
                    desconto = valorCompra * 0.03;//(3/100 equivale a 0.03)
                    valorPagar = valorCompra - desconto;
                    System.out.println("Valor a Pagar: "+valorPagar);
                    break;
            case 3: //Crediário
                    System.out.println("Quantas vezes deseja pagar?");
                    int quantidadeParcelas = teclado.nextInt();

                    System.out.println("Qual o dia do vencimento?");
                    int diaVencimento = teclado.nextInt();

                    System.out.println("Qual o dia do pagamento?");
                    int diaPagamento = teclado.nextInt();

                    int diasAtraso = diaPagamento - diaVencimento;

                    double valorParcela = valorCompra/quantidadeParcelas;

                    if (diasAtraso <= 0){
                        //pagamento em dia
                        //10% desconto sobre valor parcela (10/100 => 0.1)
                        desconto = valorParcela * 0.1;
                        valorPagar = valorParcela - desconto;
                        System.out.println("Valor a pagar: "+valorPagar);
                        System.out.println("Pagamento está em dia.");

                    }else 
                    if (diasAtraso <= 5){
                        // até 5 dias após vencimento
                        valorPagar = valorParcela;
                        System.out.println("Valor a pagar: "+valorPagar);

                    }else{
                        //mais de 5 dias de atraso no pagamento 2% multa (2/100 => 0.02)
                        double multa = valorParcela * diasAtraso * 0.02;
                        valorPagar = valorParcela+multa;
                        
                        System.out.println("Valor a pagar: "+valorPagar);

                    }
					break;

            default: //Opção inválida;
			        System.out.println("Opção de Pagamento inválida.");
					break;
       }


       teclado.close();
   } 
}
