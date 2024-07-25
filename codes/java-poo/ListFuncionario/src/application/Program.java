package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

import entities.Funcionario;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> func = new ArrayList<>();

        int quantFuncionario, i, idFuncionario;
        double percent;

        System.out.print("Informe a quantidade de funcionários: ");
        quantFuncionario = sc.nextInt();

        for (i = 0; i < quantFuncionario; i++) {
            int id;
            String nome;
            double salario;

            System.out.println("\nFuncionário %d:".formatted(i + 1));
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            nome = sc.nextLine();
            System.out.print("Salário: ");
            salario = sc.nextDouble();

            func.add(new Funcionario(id, nome, salario));
        }
        
        System.out.print("\nEntre com o Id do fucionário que terá o aumento de salário: ");
        do {
            idFuncionario = sc.nextInt();
            Integer pos = idInList(func, idFuncionario);
            if (pos == null) {
                System.out.println("O id não existe");
                System.out.print("Entre com Id valido: ");
            } else {
                System.out.print("Entre com a porcentagem: ");
                percent = sc.nextDouble();
                func.get(pos).aumentarSalario(percent);
                break;
            }
        } while (true);

        System.out.println("\nLista de funcionários");
        for (Funcionario funcionario : func) {
            System.out.println(funcionario);
        }

        sc.close();
    }

    public static Integer idInList(List<Funcionario> lista, int id) {
        int i;

        for (i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
