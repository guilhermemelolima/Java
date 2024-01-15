import java.util.Scanner;

public class Cordenadas{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("""
        \n  Q2║Q1
        ════╬════
          Q3║Q4
        """);

        //RESPOSTA EM WHILE
        
        System.out.print("Entre com as coordenadas de x: ");
        x = sc.nextInt();

        System.out.print("Enter com as coordenadas de y: ");
        y = sc.nextInt();

        while(x !=0 && y != 0){

            if (x > 0 && y > 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q1;\n\n", x, y);
            } else if (x < 0 && y > 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q2;\n\n", x, y);
            } else if (x < 0 && y < 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q3;\n\n", x, y);
            } else if (x > 0 && y < 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q4;\n\n", x, y);
            }

            System.out.print("Entre com as coordenadas de x: ");
            x = sc.nextInt();

            System.out.print("Enter com as coordenadas de y: ");
            y = sc.nextInt();
        }
        
        
        //RESPOSTA EM DO WHILE
        
        /*
        do {
            System.out.print("Entre com a coordenada x: ");
            x = sc.nextInt();

            System.out.print("Entre com a coordenada y: "); 
            y = sc.nextInt();

            if (x > 0 && y > 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q1;\n\n", x, y);
            } else if (x < 0 && y > 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q2;\n\n", x, y);
            } else if (x < 0 && y < 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q3;\n\n", x, y);
            } else if (x > 0 && y < 0) {
                System.out.printf("As coordenadas de x = %d e y = %d estão no Q4;\n\n", x, y);
            }
        } while(x != 0 && y != 0);
        */
        sc.close();
    }
}