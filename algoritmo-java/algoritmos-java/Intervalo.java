import java.util.Scanner;

public class Intervalo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);       

        /*
          * Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
          * seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor 
          * não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”. 
        */

          System.out.println("\n\n==== Intervalo ====");


          System.out.println("\nDigite um valor de 0 até 100: ");
          int valor = sc.nextInt();

          if ( valor >= 0 || valor <= 25){
            System.out.print("O valor digitado está no intervalo de 0 a 25");
          }else if(valor > 25 || valor <= 50){
            System.out.print("O valor digitado está no intervalo de 25 a 50");
          }else if(valor > 50 || valor <= 75){
            System.out.print("O valor digitado está no intervalo de 50 a 75");
          }else if (valor > 75 || valor <= 100){
            System.out.print("O valor digitado está no intervalo de 75 a 100");
          }else{
            System.out.println("Fora de intervalo");
          }

        sc.close();
    }
}    