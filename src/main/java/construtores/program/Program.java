package construtores.program;

import construtores.program.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");

        System.out.print("name: ");
        String name = sc.nextLine();

        System.out.print("price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Quantos produtos add no stock? ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Quantos produtos remover no stock? ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
