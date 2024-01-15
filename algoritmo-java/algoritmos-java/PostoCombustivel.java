import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        /* 
         * Um Posto de combustíveis deseja determinar qual de seus 
         * produtos tem a preferência de seus clientes. Escreva um 
         * algoritmo para ler o tipo de combustível abastecido (codificado 
         * da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o 
         * usuário informe um código inválido (fora da faixa de 1 a 4) 
         * deve ser solicitado um novo código (até que seja válido). 
         * O programa será encerrado quando o código informado for o 
         * número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e 
         * a quantidade de clientes que abasteceram cada tipo de combustível.
        */
        
        System.out.println("""
        \n[1] - Álcool;
        [2] - Gasolina;
        [3] - Diesel;
        [4] - fim.\n""");
        
        int alcool = 0, gas = 0, diesel = 0, combustivel;
        

        //RESPOSTA EM WHILE
        

        System.out.print("Digite o tipo de combustível abastecido: ");
        combustivel = sc.nextInt();

        while(combustivel != 4){   
            
            if (combustivel == 1) {
                alcool++;
            } else if (combustivel == 2) {
                gas++;
            }else{
                diesel++;
            }

            System.out.print("Digite o tipo de combustível abastecido: ");
            combustivel = sc.nextInt();

        }
        

        //RESPOSTA EM DO WHILE

        /* do{
             System.out.print("Digite o tipo de combustível abastecido: ");
             combustivel = sc.nextInt();
             if (combustivel == 1) {
                 alcool++;
             } else if (combustivel == 2) {
                 gas++;
             }else{
                 diesel++;
             }            

         }while(combustivel != 4);*/
        
        System.out.printf("""
        \n\u272f Álcool:   %d;
        \u272f Gasolina: %d;
        \u272f Diesel:   %d.
        """,alcool, gas, diesel);

        System.out.println("Muito obrigado;");

        sc.close();
    }
}