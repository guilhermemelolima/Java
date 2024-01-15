import java.util.Scanner;

public class ValorPeca{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         /*
            * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor 
            * unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor 
            * unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        */
        
        System.out.print(" Informe o código, quantidade e valor unitário da peça1: ");
        int codeParts1 = sc.nextInt();
        int quantityParts1 = sc.nextInt();
        double valueParts1 = sc.nextDouble();

        System.out.print(" Informe o código, quantidade e valor unitário da peça2: ");
        int codeParts2 = sc.nextInt();
        int quantityParts2 = sc.nextInt();
        double valueParts2 = sc.nextDouble();

        double total = quantityParts1 * valueParts1 + quantityParts2 * valueParts2;

        System.out.printf("O total a ser pago pelas peças de código %d e %d é de %.2f.", codeParts1, codeParts2, total);
          
        
        sc.close();
    }
}