import java.util.Scanner;

public class HoraJogo {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
       
        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
         * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        */
        
        System.out.print("\nEntre com a hora de início e fim respectivamente do jogo: ");
        int inicio = sc.nextInt(), fim = sc.nextInt();
        
        int duracao;

        if (inicio < fim) {
          duracao = fim - inicio;
        } else {
          duracao = 24 - inicio + fim;
        }

        System.out.printf("A duração do jogo foi de %d hora(s)\n", duracao);
        
        sc.close();
    }
}