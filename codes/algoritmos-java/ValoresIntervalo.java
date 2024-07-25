import java.util.Scanner;

public class ValoresIntervalo{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        /* 
         * Leia um valor inteiro N. Este valor será a 
         * quantidade de valores inteiros X que serão 
         * lidos em seguida. Mostre quantos destes valores 
         * X estão dentro do intervalo [10,20] e quantos 
         * estão fora do intervalo, mostrando essas informações 
         * conforme exemplo (use a palavra "in" para 
         * dentro do intervalo, e "out" para fora do intervalo).
        */
        
        System.out.print("\nEntre com a valor para o loops: ");
        int number = sc.nextInt();

        int value, in = 0, out = 0;

        for (int i = 0; i < number ; i++ ){
            
            System.out.print("Entre com o valor: ");
            value = sc.nextInt();

            if (20 >= value && value >= 10) {
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("\nin:  %d;\nout: %d.",in,out);

        sc.close();
    }
}