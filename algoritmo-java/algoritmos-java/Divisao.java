import java.util.Scanner;

public class Divisao{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
       
        /* 
         * Fazer um programa para ler um número N. Depois 
         * leia N pares de números e mostre a divisão do 
         * primeiro pelo segundo. Se o denominador for 
         * igual a zero, mostrar a mensagem "divisão impossível". 
        */        
        
        System.out.print("Digite o número de loops: ");
        int loop = sc.nextInt();
        
        for ( int i = 0; i < loop ; i++ ) {

            System.out.print("Digite o numerador: ");
            int numerador = sc.nextInt();

            System.out.print("Digite o denominador: ");
            int denominador = sc.nextInt();

            System.out.printf("A divisão de %d por %d é igual a %.2f", 
            numerador, denominador, (double) numerador/denominador);
        }
        sc.close();
    }
}
