import java.util.Scanner;

public class Divisores{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        /* 
         * Ler um número inteiro N e calcular todos os seus divisores. 
        */

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        
        System.out.printf("Os divisores de %d são: ",valor);
        for ( int i = 1; i <= valor; i++){
            if (valor % i == 0){
                System.out.printf("%d ", i);
            }
        }

        sc.close();
    }
}