 import java.util.Scanner;
 public class Ar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Enter your age (enter a negative number to quit):");
        age = scanner.nextInt();

        while (age >= 0) {
            if (age >= 18) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a minor.");
            }

            System.out.print("Enter your age (negative to quit): ");
            age = scanner.nextInt();
        }

        System.out.println("Age check complete.");
        scanner.close();
    }
}




 
