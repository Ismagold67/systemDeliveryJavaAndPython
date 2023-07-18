package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner((System.in));
        int desconto;
        double valor_pedido;
        int n;
        String order;

        System.out.print("Quantidade de pedidos: ");
        n = ler.nextInt();

        for(int i = 1; i < n + 1;i++) {

            order = ler.nextLine();
            System.out.printf("Digite seu %d° pedido: ", i);
            order = ler.nextLine();

            System.out.print("Digite o valor do pedido: R$ ");
            valor_pedido = ler.nextDouble();

            System.out.print("Digite o valor do desconto (10/20): ");
            desconto = ler.nextInt();

            while(desconto != 10 && desconto != 20){
                System.out.println("Desculpe, mas esse valor de desconto não se encontra disponível! Tente novamente!");
                System.out.println("Digite o valor do desconto (10/20): ");
                desconto = ler.nextInt();
            }

            double get_desc10 = valor_pedido - (valor_pedido * 0.1);
            double get_desc20 = valor_pedido - (valor_pedido * 0.2);

            if (desconto == 10) {
                System.out.printf("Valor total com desconto de 10 por cento: R$ %.2f %n", (get_desc10));
                System.out.print("");
            } else if (desconto == 20) {
                System.out.printf("Valor total com desconto de 20 por cento: R$ %.2f %n", (get_desc20));
                System.out.print("");
            } else {
                System.out.printf("Valor total do pedido: %.2f ", (valor_pedido));
                System.out.print("");
            }


        }

    }
}