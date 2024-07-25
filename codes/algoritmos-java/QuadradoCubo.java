import java.util.Scanner;

public class QuadradoCubo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        /* 
         * Fazer um programa para ler um número inteiro positivo N. 
         * O programa deve então mostrar na tela N linhas, começando 
         * de 1 até N. Para cada linha, mostrar o número da linha, 
         * depois o quadrado e o cubo do valor, conforme exemplo.
        */

        
        System.out.print("Entre com um valor: ");
        int valor = sc.nextInt();

        for (int i = 1; i < valor + 1; i++) {
            System.out.printf("%d %d %d\n", 
            i,(int) Math.pow(i,2),(int) Math.pow(i,3));
        }

        sc.close();
    }
}