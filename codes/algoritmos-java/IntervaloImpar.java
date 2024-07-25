import java.util.Scanner;

public class IntervaloImpar{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        /* 
         * Leia um valor inteiro X (1 <= X <= 1000). 
         * Em seguida mostre os ímpares de 1 até X, 
         * um valor por linha, inclusive o X, se for o caso.
        */

        System.out.print("\nEntre com um valor: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++){
            if (i % 2 != 0){
                System.out.printf("%d ",i);
            }
        }

        sc.close();
    }
}