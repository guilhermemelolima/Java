import java.util.Scanner;

public class Lanchonete {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        /*
          * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
          * A seguir, calcule e mostre o valor da conta a pagar
        */

        System.out.print(""" 
                    \nTABELA DE PREÇOS
          ╔════════╦═════════════════╦═════════╗
          ║ CÓDIGO ║ ESPECIFICAÇÃO   ║ PREÇO   ║
          ╠════════╬═════════════════╬═════════╣
          ║   01   ║ CACHORRO QUENTE ║ R$ 4,00 ║
          ║   02   ║ X-SALADA        ║ R$ 4,50 ║
          ║   03   ║ X-BACON         ║ R$ 5,00 ║
          ║   04   ║ TORRADA SIMPLES ║ R$ 2,00 ║
          ║   05   ║ REFRIGERANTE    ║ R$ 1,50 ║
          ╚════════╩═════════════════╩═════════╝
        \n""");

        double total = 0,quant;
        int item;
        System.out.print("Digite um dos código e quantidade dos produtos acima: ");
        item = sc.nextInt();
        quant = sc.nextInt();

        if(item == 1){
          total = 4 * quant;
        }else if(item == 2){
          total = 4.5 * quant;
        }else if(item == 3){
          total = 5 * quant;
        }else if(item == 4){
          total = 2 * quant;
        }else if(item == 5){
          total = 1.5 * quant;
        }else{
            System.out.println("!!ERRO, ENTRADA NÃO VÁLIDA!!");
        }

        if(total != 0){
          System.out.printf("Total: %.2f\n\n", total);
        }
        sc.close();
    }
}