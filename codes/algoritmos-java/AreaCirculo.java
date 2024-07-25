import java.util.Scanner;

public class AreaCirculo{
    public static void main(String []args){
                
        Scanner sc = new Scanner(System.in);

        double area, radius, pi = 3.14159;

        System.out.print("\nDigite o raio do circulo: ");
        radius = sc.nextDouble();
        area = Math.pow(radius,2) * pi;

        System.out.printf("\nÁrea total de um circulo de radius %.2f é de %.4f.\n",radius, area);
                 
        sc.close();

    }
}