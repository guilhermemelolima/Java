import java.util.Scanner;

public class Multiplos {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Múltiplos" 
         * ou "Nao sao Múltiplos", indicando se os valores lidos são múltiplos entre si. 
         * Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.
        */

        int a, b;

        System.out.print("\nDigite o primeiro valor: ");
        a = sc.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();
        
        if(a % b == 0 ){
           System.out.printf("%d e %d são múltiplos",a,b);
        }else if(b % a == 0){
           System.out.printf("%d e %d são múltiplos",b,a);
        }else{
           System.out.printf("%d e %d não são múltiplos",a,b);
        }

        sc.close();
    }
}