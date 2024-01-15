import java.util.Scanner;

public class SalarioFunc{
    public static void main(String[] args){

        /*
            * Fazer um programa que leia o número de um funcionário, seu número de horas 
            * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. 
            * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.            
        */

        Scanner sc = new Scanner(System.in);

        int numberWorker;
        double hourWorked, valueHour, wages;

        System.out.print("Informe o número do funcionário: ");
        numberWorker = sc.nextInt();
        System.out.printf("Informe o total de horas trabalhadas pelo funcionário %d: ",numberWorker);
        hourWorked = sc.nextDouble();
        System.out.printf("Informe o valor horas do funcionário %d: ", numberWorker);
        valueHour = sc.nextDouble();

        wages = hourWorked * valueHour;

        
        System.out.printf("O salário do funcionário %d é R$ %.2f.",numberWorker, wages);

        sc.close();
    }
}