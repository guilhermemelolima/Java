package application;

import java.util.Arrays;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantQuartAlugados, i;

        System.out.print("Informe a quantidade de quartos a serem alugados: ");
        quantQuartAlugados = sc.nextInt();
        sc.nextLine();

        Aluguel[] alugueis = new Aluguel[10];
        Arrays.fill(alugueis, null);

        for ( i = 0; i < quantQuartAlugados; i++) {
            String nome, email;
            int quarto;

            System.out.printf("\nLocador %d:%n", i + 1);
            System.out.print("Informe seu nome: ");
            nome = sc.nextLine();
            System.out.print("Informe seu e-mail: ");
            email = sc.nextLine();
            System.out.print("Informe o quarto que será alugado: ");
            quarto = sc.nextInt();
            sc.nextLine();

            alugueis[quarto] = new Aluguel(nome, email);
        }

        System.out.println("\nQuartos Ocupados:");
        for ( i = 0; i < 10; i++) {
            if (alugueis[i] != null) {
                System.out.printf("%d: %s%n", i, alugueis[i]);
            }
        }

        sc.close();
    }

}
