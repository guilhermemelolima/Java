import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
              
        /*
          * Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas 
          * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
          * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 
          * Se o ponto estiver na origem, escreva a mensagem “Origem”. 
          * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
          * 
          *    y
          * Q2 | Q1
          * ---+----x 
          * Q3 | Q4
          * 
        */

        System.out.printf("""
        \nTendo o seguinte plano cartesiano como base:
         
            Y  
         Q2 | Q1
        ────┼──── X
         Q3 | Q4

        Informe duas coordenadas.
        """);
          
        System.out.print("Informe a coordenada x: ");
        double x = sc.nextInt();
        System.out.print("\nInforme a coordenada y: ");
        double y = sc.nextInt();

        if(x > 0 && y > 0){ System.out.printf("As coordenadas estão no Q1. (x = %.2f; y = %.2f)\n",x,y);
        }else if(x < 0 && y > 0){
          System.out.printf("As coordenadas estão no Q2. (x = %.2f; y = %.2f)\n",x,y);
        }else if(x > 0 && y < 0){
          System.out.printf("As coordenadas estão no Q4. (x = %.2f; y = %.2f)\n",x,y);
        }else if(x < 0 && y < 0){
          System.out.printf("As coordenadas estão no Q3. (x = %.2f; y = %.2f)\n",x,y);
        }else if(x == 0 && y != 0){
          System.out.printf("As coordenas estão no eixo y. (x = %.2f; y = %.2f)\n", x,y);
        }else if(y == 0 && x != 0){
          System.out.printf("As coordenas estão no eixo x. (x = %.2f; y = %.2f)\n", x,y);
        }else{
          System.out.printf("As coordenadas estão no ponto 0. (x = %.2f; y = %.2f)\n",x,y);
        }

        sc.close();
    }
}