import java.util.Scanner;

public class Fatorial{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
       
        /* 
         * Ler um valor N. Calcular e escrever seu respectivo 
         * fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
         * Lembrando que, por definição, fatorial de 0 é 1. 
        */


        System.out.print("Digite um valor: ");
        int factorial = sc.nextInt();
        
        int result = 1;

        for ( int i = factorial; i > 0; i--){
            result *= i;
            System.out.printf("%d ", i);
        }
        System.out.printf(" = %d\n", result);
        
        sc.close();
    }
}