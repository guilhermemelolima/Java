import java.util.Scanner;

public class DiferencaProd{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*
            * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
            * A seguir, calcule e mostre a diferença do produto de A e B pelo 
            * produto de C e D segundo a fórmula: DIFERENÇA = (A * B - C * D).
        */

        int a, b, c, d, difference;

        System.out.print("Digite o valor de a: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de b: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de c: ");
        c = sc.nextInt();
        System.out.print("Digite o valor de d: ");
        d = sc.nextInt();

        difference = a * b - c * d;

        System.out.printf("A diferença do produto de %d e %d pelo produto de %d e %d, é igual a %d", a,b,c,d,difference);
        

        sc.close();
    }
}