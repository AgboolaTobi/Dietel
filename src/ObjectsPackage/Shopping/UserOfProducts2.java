package ObjectsPackage.Shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOfProducts2 {
    public static void main(String[] args) {
        ArrayList<Product> product = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Product product1 = new Product();
        for (int i = 0; i < 3; i++){
            System.out.println("What was bought? ");
            product1.setName(scanner.next());
            System.out.println("How much for each? ");
            product1.setPrice(Double.parseDouble(scanner.next()));
            System.out.println("How many of each was bought? ");
            product1.setQuantity(Integer.parseInt(scanner.next()));
            product.add(product1);
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%s   %s  %s  %n",product1.getName(),product1.getPrice(),product1.getQuantity());
        }
    }
}
