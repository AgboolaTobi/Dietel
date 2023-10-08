package Dietelchapter3;

public class CarMainTest {
        public static void main(String[] args){

            Car car1 = new Car();
            Car car2 = new Car();

            car1.setPrice(5000);
            car2.setPrice(8000);

            System.out.printf("first car price is : %f%n", car1.getPrice());
            System.out.printf("Second  car price is : %f%n", car2.getPrice());

            car1.setModel("Toyota Camry");
            car2.setModel("Lexus Rx350");
            car1.discountPrice(5);
            car2.discountPrice(7);

            System.out.println("First car " + car1.getModel() + " discount price is : " + car1.getPrice());
            System.out.printf("Second car " + car2.getModel() + " discount price is : ", car2.getPrice());

        }

}
