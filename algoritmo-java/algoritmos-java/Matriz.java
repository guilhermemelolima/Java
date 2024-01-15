package application;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        /*
            * Fazer um programa para ler dois números inteiros M e K, e depois ler
            * uma matriz de M linhas por N colunas contendo números inteiros,
            * podendo haver repetições. Em seguida, ler um número inteiro X que
            * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
            * esquerda, acima, à direita e abaixo de X, quando houver.
        */

        Scanner sc = new Scanner(System.in);

        int i, j, tlinhas, tcolunas;

        System.out.print("Entre com o total de linhas: ");
        tlinhas = sc.nextInt();
        System.out.print("Entre com o total de colunas: ");
        tcolunas = sc.nextInt();
        System.out.println("");
        int[][] mat = new int[tlinhas][tcolunas];

        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.printf("Entre com o valor para o campo [%d][%d]: ",i+1,j+1);
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.print("Informe uma número: ");
        int num = sc.nextInt();
        
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.printf("[%d] ", mat[i][j]);
            }
            System.out.println();
        }
        
        for (i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == num){
                    System.out.printf("\nPosição na matriz: %d,%d", i, j);
                    if(i+1 < mat.length)
                        System.out.printf("\nAbaixo: %d", mat[i+1][j]);
                    if(j-1 > -1 )
                        System.out.printf("\nÀ esquerda: %d", mat[i][j-1]);
                    if(i-1 > -1 )
                        System.out.printf("\nAcima: %d", mat[i-1][j]);
                    if(j+1 < mat[i].length)
                        System.out.printf("\nÀ direita: %d\n", mat[i][j+1]);
                }
            }            
        }
    }
    
}
