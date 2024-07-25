import java.util.Scanner;

public class SomaDoisValores{    
    public static void main(String []args){     

        Scanner sc = new Scanner(System.in);        

        /*
            * Faça um programa para ler dois valores inteiros, e 
            * depois mostrar na tela a soma desses números com uma
            * mensagem explicativa, conforme exemplos.
        */
        
        int value1, value2;

        System.out.print("\nDigite o primeiro valor a ser somado: ");
        value1 = sc.nextInt();
        System.out.print("Digite o segundo valor a ser somado: ");
        value2 = sc.nextInt();

        System.out.printf("\nA soma de %d com %d é %d\n", value1, value2, value1 + value2);
      
        sc.close();
    }

}
