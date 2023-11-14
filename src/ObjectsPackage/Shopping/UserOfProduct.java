package ObjectsPackage.Shopping;

import java.util.Scanner;

public class UserOfProduct {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i ++){
            Product newProduct = new Product();
            System.out.println("What product was bought ? ");
            newProduct.setName(scanner.nextLine());
            System.out.println("How much for product bought ? ");
            newProduct.setPrice(Double.parseDouble(scanner.nextLine()));
            System.out.println("How many quantity was bought ? ");
            newProduct.setQuantity(Integer.parseInt(scanner.nextLine()));
            products[i] = newProduct;

        }
        for (Product product: products){
            System.out.println(product);
        }
//        for (int i = 0; i < 3; i++) {
//            double total = products[i].getPrice() * products[i].getQuantity();
//            System.out.printf("%10s%10s%10s%10s%n",products[i].getName(),products[i].getPrice(),products[i].getQuantity(),total);
//
//        }

    }
}
