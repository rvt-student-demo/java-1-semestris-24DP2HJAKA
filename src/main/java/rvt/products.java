package rvt;

import java.util.scanner;

public class Main
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter the product price:");
        String productPrice = scanner.nextLine();
        System.out.println("Enter the product quantity:");

        String productQuantity = scanner.nextLine();

        System.out.println("Product name: " + productName);
        System.out.println("Product price: " + productPrice);
        System.out.println("Product quantity: " + productQuantity);


    }
}