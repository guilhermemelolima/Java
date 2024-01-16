package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe quantos produtos vão ser cadastrados: ");
        int quatProd = sc.nextInt();
        sc.nextLine();

        Produto[] produtos = new Produto[quatProd];
        int resp, quant;

        for (int i = 0; i < quatProd; i++){
            System .out.print("\nEntre com o nome do produto: ");
            String nome = sc.nextLine();

            System.out.print("Entre com o preço unitário do produto: ");
            double preco = sc.nextDouble();

            System.out.print("Entre com a quantidade do produto: ");
            int quantidade = sc.nextInt();
            
            produtos[i] = new Produto(nome, preco, quantidade);
        }
        
        
        do{
            System.out.println("\n\nEscolha dentre as seguinte opções para continuar: ");
            System.out.println("""
            [1] - Adicionar produto 
            [2] - Remover produto
            [3] - Mostrar Estoque
            [4] - Sair
            """);
            System.out.print("Digite: ");
            resp = sc.nextInt();
            
            switch (resp){
                case 1:
                    System.out.print("\nDigite o índice do produto para adicionar ao estoque: ");
                    int indexAdd = sc.nextInt();
                    System.out.print("Digite a quantidade de produtos a ser adicionada ao estoque: ");
                    quant = sc.nextInt();
                    produtos[indexAdd].AddProduto(quant);
                break;
                
                case 2:
                    System.out.print("\nDigite o índice do produto para remover do estoque: ");
                    int indexRemove = sc.nextInt();
                    System.out.print("Digite a quantidade de produtos a ser removida do estoque: ");
                    quant = sc.nextInt();
                    produtos[indexRemove].RemoveProduto(quant);
                break;

                case 3:
                    for (Produto produto : produtos) {
                        System.out.println(produto.toString());
                    }
                break;
            }
            
        }while(resp != 4);

        System.out.println("Fim do programa | Obrigador por usar \u263A");
        sc.close();
    }
}