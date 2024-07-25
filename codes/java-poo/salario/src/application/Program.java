package application;

import entities.Funcionario;
import java.util.Scanner;

public class Program {

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
