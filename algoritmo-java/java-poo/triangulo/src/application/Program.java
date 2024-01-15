package application;
import java.util.Scanner;
import entities.Triangulo;

public class Program{

    public static void main(String[] args){

        /*
         * Fazer um programa para ler os valores da largura e altura de um retângulo, 
         * ele ainda deve mostrar na tela o valor de sua área, perímetro e diagonal. 
         * Seguir a mesma estrutura do exercício "triangulo".
         */

        Scanner sc = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.printf("\n\nEntre com as medidas do trianguloX: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.printf("\nEntre com as medidas do trianguloY: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("\n\nÁrea do triangulo X é: %.2f\n", areaX);
        System.out.printf("Área do triangulo Y é: %.2f", areaY);

        if (areaX > areaY){
            System.out.println("\nMaior área é do triangulo x.");
        }else{
            System.out.println("\nMaior área é do triangulo y.");
        }
        
        sc.close();
    }
}