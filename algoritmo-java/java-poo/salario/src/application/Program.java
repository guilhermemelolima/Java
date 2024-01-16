package application;

import entities.Funcionario;
import java.util.Scanner;

public class Program {

    /*
    * Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). 
    * Em seguida, mostrar os dados do funcionário(nome e salário líquido). Em seguida, aumentar 
    * o salário do funcionário com base em uma porcentagem dada 
    * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("Informe o nome do funcionário: ");
        String nome = sc.nextLine();
        
        System.out.printf("Informe o salário bruto do funcionário: ");
        double salarioBruto = sc.nextDouble();

        System.out.printf("Informe o valor de desconto sobre o salário bruto: ");
        double desconto = sc.nextDouble();

        Funcionario func = new Funcionario(nome, salarioBruto, desconto);

        System.out.println(func);

        func.aumentoSalario(10);

        System.out.println(func);

        sc.close();
    }
    
}
