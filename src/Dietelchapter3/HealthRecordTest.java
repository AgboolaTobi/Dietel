package Dietelchapter3;
import java.util.Scanner;
public class HealthRecordTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HealthRecord health = new HealthRecord("Agboola", "Tobi", "male", 16, "December", 2010, 55, 75);

        System.out.println("Enter first name : ");
        String firstname = scanner.nextLine();
        health.setName(firstname);

        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();
        health.setSurname(surname);

        System.out.println("Enter your birthday date :");
        int dateOfBirth = scanner.nextInt();
        health.setDateOfBirth(dateOfBirth);

        System.out.println("Enter your birthday month in word : ");
        String monthOfBirthday = scanner.next();
        health.setMonthOfBirth(monthOfBirthday);

        System.out.println("Enter your birth year: ");
        int yearOfBirth = scanner.nextInt();
        health.setYearOfBirth(yearOfBirth);

        System.out.println("Enter your Gender : ");
        String myGender = scanner.next();
        health.setGender(myGender);

        System.out.println("Enter your weight in pounds : ");
        int weightInPounds = scanner.nextInt();
        health.setWeight(weightInPounds);

        System.out.println("Enter your height in inches : ");
        int height = scanner.nextInt();
        health.setHeight(height);

        System.out.println("Name : " + health.getSurname() + " " + health.getFirstname());
        System.out.println("Gender: " + health.gender());
        System.out.println("Date of Birth : " + health.getDateOfBirth() + " " + health.getMonthOfBirth() + " " + health.getYearOfBirth());
        System.out.println("Weight : " + health.getWeight());
        System.out.println("Height : " + health.getHeight());
        System.out.println("Enter the current year: ");
        int year = scanner.nextInt();
        health.ageCaculator(year);
        health.maximumHeartRate();
        health.bodyMassIndex();
        System.out.println("Kindly confirm your Detail : ");
        System.out.println();
        System.out.println("Name: " + health.getSurname() + " " + health.getFirstname());
        System.out.println("Date of Birth : " + health.getDateOfBirth() + health.getMonthOfBirth() + health.getYearOfBirth());
        System.out.println("Current Age In Year : " + health.ageCaculator(2023));
        System.out.println();

        System.out.println("Body Mass Categories");
        System.out.println("Normal weight = 18.5 _ 24.9");
        System.out.println("Underweight = <18.5");
        System.out.println("Overweight = 25 - 29.9");
        System.out.println("obesity = 30 >=" + " that is greater than or equal to 30");


        System.out.println("Body Mass iIndex : " + health.bodyMassIndex());
        System.out.println();
        System.out.println("Maximum Heart rate Calculator : " + health.maximumHeartRate());

        System.out.println(" Moderate intensity Physical activity is between 50% and 65%");
        System.out.println("For vigorous intensity excercise is within 70% and 85%");

        System.out.println("Enter your  desire training intensity : ");
        double excersise = scanner.nextInt();

        health.targetHeart(excersise);

        System.out.println("Enter second desire training intensity: ");
        double excerise2 = scanner.nextInt();
        health.targetHeart(excerise2);

        System.out.println();

        System.out.println("Your target heart rate is : " + health.targetHeart(excersise) + health.targetHeart(excerise2));

    }
}
