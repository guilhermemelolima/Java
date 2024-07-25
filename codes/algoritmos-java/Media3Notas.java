import java.util.Scanner;

public class Media3Notas{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        /* 
         * Leia 1 valor inteiro N, que representa o 
         * número de casos de teste que vem a seguir. 
         * Cada caso de teste consiste de 3 valores 
         * reais, cada um deles com uma casa decimal. 
         * Apresente a média ponderada para cada um destes 
         * conjuntos de 3 valores, sendo que o primeiro 
         * valor tem peso 2, o segundo valor tem peso 3 
         * e o terceiro valor tem peso 5. 
        */
       
        System.out.print("Digite o número de casos: ");
		int casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++){
		    
		    System.out.print("Digite as 3 notas: ");
		    double nota1 = sc.nextDouble();
		    double nota2 = sc.nextDouble();
		    double nota3 = sc.nextDouble();
		
		    double media = (nota1 * 2.0 + nota2* 3.0 + nota3 * 5.0) / 10;
		
		    System.out.printf("A média dos valor informados é %f", media);    
		}
        
        sc.close();
    }
}