package Dietelchapter3;

import java.util.Scanner;

public class Petrol1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your petrol location ");
        String myLocation = scanner.nextLine();
        PetrolPurchase myPetrolPurchase = new PetrolPurchase();
        System.out.println("Enter petrol type: ");
        myPetrolPurchase.setLocation(myLocation);
        myPetrolPurchase.setType_of_petrol("Diesel");
        myPetrolPurchase.setQuantity(5);
        myPetrolPurchase.setPrice(3000);
        myPetrolPurchase.setDiscount(250.00);
        System.out.println("The petrol station is located at " + myPetrolPurchase.getLocation());
        System.out.println("Petrol type" + myPetrolPurchase.getType_of_petrol());
        System.out.println("The quantity of petrol is " + myPetrolPurchase.getQuantity());
        System.out.println("Petrol purchase price = " + myPetrolPurchase.getPrice());
        System.out.println("Discount on purchase = " + myPetrolPurchase.getDiscount());
        System.out.println("Net purchase amount = " + myPetrolPurchase.getPurchaseAmount());



    }
}
