import java.util.Scanner;

public class AreasGeometricas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        /*  
            * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: 
            * A, B e C. Em seguida, calcule e mostre:
            * a) a área do triângulo retângulo que tem A por base e C por altura.
            * b) a área do círculo de raio C. (pi = 3.14159)
            * c) a área do trapézio que tem A e B por bases e C por altura.
            * d) a área do quadrado que tem lado B.
            * e) a área do retângulo que tem lados A e B.
        */

        System.out.print("Entre com o valor de A B C: ");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        System.out.printf("A área do triângulo retângulo que tem A por base e C por altura é: %.2f;",(A * C) / 2.0);
        System.out.printf("A área do círculo de raio Cé: %.2f;",3.14159 * Math.pow(C,2));
        System.out.printf("A área do trapézio que tem A e B por bases e C por altura é: %.2f;", ((A + B) * C) / 2.0);
        System.out.printf("A área do quadrado que tem lado B: %.2f;", Math.pow(B,2.0));
        System.out.printf("A área do retângulo que tem lados A e B.: %.2f.", A * B);


        sc.close();
    }
}
