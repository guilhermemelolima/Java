import java.util.Scanner;

public class AreaCirculo{
    public static void main(String []args){
                
        Scanner sc = new Scanner(System.in);

        /*  
            * Faça um programa para ler o valor do raio de um círculo, 
            * e depois mostrar o valor da área deste círculo com quatro casas 
            * decimais conforme exemplos.
            * Fórmula da área: area = π . raio2
            * Considere o valor de π = 3.14159
        */

        double area, radius, pi = 3.14159;

        System.out.print("\nDigite o raio do circulo: ");
        radius = sc.nextDouble();
        area = Math.pow(radius,2) * pi;

        System.out.printf("\nÁrea total de um circulo de radius %.2f é de %.4f.\n",radius, area);
                 
        sc.close();

    }
}