import java.util.Scanner;

public class OddEvenNumberProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = getValidNumber(scanner);

            classifyNumber(number);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }

    private static int getValidNumber(Scanner scanner) {
        int number;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // consume the invalid input
            }
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Please enter a non-negative number.");
            }
        } while (number < 0);
        return number;
    }

    private static void classifyNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
