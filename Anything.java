// use the Scanner class
import java.util.Scanner;
public class Anything {
    public static void main (String[] args){ //remember this
        System.out.println("\n\n Welcome to the largest numbers program\n\n"); // print to your monitor
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner myScanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.println("\n\nPlease enter the first number\n\n");
        int num1 = myScanner.nextInt();

        System.out.println("you entered: " + num1);


        System.out.println("\n\nPlease enter the second number\n\n");
        int num2 = myScanner.nextInt();

        System.out.println("you entered: " + num2);

        System.out.println("\n\nPlease enter the third number\n\n");
        int num3 = myScanner.nextInt();

        System.out.println("you entered: " + num3);


        System.out.println("\n\nAll the numbers you had entered are: \n\n" + num1 + "and" + num2 + "and" + num3);
        int largest = num1;
        if (num2 > largest){
            largest = num2;
        }
        if (num3>largest){
            largest = num3;
        }
        System.out.println("\n\nThe largest number is: \n\n" + largest);
    }
}
