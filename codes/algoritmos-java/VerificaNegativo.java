import java.util.Scanner;

public class VerificaNegativo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        /*
         * Fazer um programa para ler um número inteiro,
         * e depois dizer se este número é negativo ou não.
        */

        int number;
        
        System.out.print("\nDigite um número: ");
        number = sc.nextInt();
        
        if(number < 0){
           System.out.printf("\nO valor %d é menor que zero.\nNEGATIVO", number);
        }
        else if(number > 0){
           System.out.printf("\nO valor %d é maior que zero\nNÃO NEGATIVO", number);
        }
        else{
           System.out.printf("O valor digitado é igual a 0.");
        }
        sc.close();
    }
}