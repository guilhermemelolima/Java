import java.util.Scanner;

public class ParImpar {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite um valor: ");
        int numero = sc.nextInt();
        if(numero % 2 == 0){
           System.out.printf("O valor de %d é par", number);
        }else{
           System.out.printf("\nO valor de %d é impar",number);
        }

        sc.close();
    }
}