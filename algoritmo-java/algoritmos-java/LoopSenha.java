import java.util.Scanner;

public class LoopSenha {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        /* 
         * Escreva um programa que repita a leitura de uma senha até 
         * que ela seja válida. Para cada leitura de senha incorreta 
         * informada, escrever a mensagem "Senha Invalida". Quando a 
         * senha for informada corretamente deve ser impressa a mensagem 
         * "Acesso Permitido" e o algoritmo encerrado. Considere que a 
         * senha correta é o valor 2002. 
        */

        int senha;
        
        // Resposta em while
        
        System.out.print("\nEntre com a senha: ");
        senha = sc.nextInt();

        while(senha != 2002){
            System.out.println("Acesso negado;");
        
            System.out.print("Digite a senha novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido;");
        
        
        // Resposta em do while

        /* do{
           System.out.print("Entre com a senha: ");
           senha = sc.nextInt();

           if (senha != 2002){
               System.out.println("Acesso negado;");
           }
        }while(senha != 2002);
        System.out.println("Acesso permitido;"); 
        */

        sc.close();
    }
}