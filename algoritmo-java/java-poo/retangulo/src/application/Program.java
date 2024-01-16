package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Retangulo;

public class Program{

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo rec = new Retangulo();

        System.out.print("Entre com largura e altura: ");
        rec.largura = sc.nextDouble();
        rec.altura = sc.nextDouble();
        
        System.out.printf("""
        Área:      %.2f;
        Perímetro: %.2f;
        Diagonal:  %.2f.
        """,rec.area(), rec.perimetro(), rec.diagonal());
        

        sc.close();
    }
}

