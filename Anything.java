// use the Scanner class
import java.util.Scanner;

public class Anything {
    public static void main(String[] args){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;



        System.out.println("\n\n Welcome to the largest numbers program! \n\n");

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number.
        System.out.println("\n Please enter the first number: ");
        num1 = scanner.nextInt();
        System.out.println("\n you entered: " + num1);

        // Prompt the user for the second number.
        System.out.println("\n Please enter the second number: ");
        num2 = scanner.nextInt();
        System.out.println("\n you entered: " + num2);

        // Prompt the user for the third number.
        System.out.println("\n Please enter the third number: ");
        num3 = scanner.nextInt();
        System.out.println("\n you entered: " + num3);

        System.out.println("\n The numbers are: " + num1 + " and " + num2 + " and " + num3);

        // Find the largest number
        largestNum = num1;

        if (num2 > largestNum) {
            largestNum = num2;
        }

        if (num3 > largestNum) {
            largestNum = num3;
        }

        // Display the largest number.
        System.out.println("\n The largest number is: " + largestNum);

    }
}
