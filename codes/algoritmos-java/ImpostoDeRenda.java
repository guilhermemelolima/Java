import java.util.Scanner;

public class ImpostoDeRenda {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
       
    /*
    * 
    * Em um país imaginário denominado Lisandro, todos os habitantes ficam felizes em pagar seus 
    * impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados 
    * são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o Romulus, 
    * cujo símbolo é o R$. Leia um valor com duas casas decimais, equivalente ao salário de uma 
    * pessoa de Lisandro. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto 
    * de Renda, segundo a tabela abaixo. 
    * 
    * ╔══════════════════════════════╦═══════════════════╗
    * ║ Renda                        ║ imposto de renda  ║
    * ╠══════════════════════════════╬═══════════════════╣
    * ║ de R$ 0,00 até R$ 2000,00    ║ Isento            ║
    * ║ de R$ 2000,01 até R$ 3000,00 ║ 08%               ║
    * ║ de R$ 3000,01 até R$ 4500,00 ║ 18%               ║
    * ║ acima de R$ 4500,00          ║ 28%               ║
    * ╚══════════════════════════════╩═══════════════════╝        
    * 
    * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, 
    * pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
    * No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que 
    * resulta em R$ 80.36 no total. O valor deve ser impresso com duas casas decimais. 
    * 
    */
          
         
    System.out.print("Informe o salário: ");
    double salario = sc.nextDouble();
    double imposto;
          
    System.out.print("""
    \nDe acordo com a tabela de imposto abaixo:
    ╔══════════════════════════════╦═══════════════════╗
    ║ Renda                        ║ imposto de renda  ║
    ╠══════════════════════════════╬═══════════════════╣
    ║ de R$ 0,00 até R$ 2000,00    ║ Isento            ║
    ║ de R$ 2000,01 até R$ 3000,00 ║ 08%               ║
    ║ de R$ 3000,01 até R$ 4500,00 ║ 18%               ║
    ║ acima de R$ 4500,00          ║ 28%               ║
    ╚══════════════════════════════╩═══════════════════╝
    """);

    if(salario <= 2000){
      System.out.println("Seu salário é isento de imposto de renda\n");
    } else if(2000 < salario || salario <= 3000 ){
      imposto = salario * 0.08;
      System.out.printf("Seu salário tem imposto igual a 8%%: salário(%.2f) - imposto (%.2f) = %.2f\n", salario, imposto, (salario - imposto));
    } else if(3000 < salario || salario < 4000){
      imposto = salario * 0.18;
      System.out.printf("Seu salário tem imposto igual a 18%%: salário(%.2f) - imposto (%.2f) = %.2f\n", salario, imposto, (salario - imposto));
    } else if(4500 < salario){
      imposto = salario * 0.28;
      System.out.printf("Seu salário tem imposto igual a 28%%: salário(%.2f) - imposto (%.2f) = %.2f\n", salario, imposto, (salario - imposto));
    }
    sc.close();
  }
}
    
