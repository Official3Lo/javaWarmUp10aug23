import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("+-------------------+\n"
                            +"|    SIT Program    |\n"
                            +"+-------------------+\n\n");

        //Data variable
        int num1=0,num2=0,num3=0, largest = 0;
        Scanner sc = new Scanner(System.in);

        //Input value for data
        System.out.println("Enter a num: ");
        num1 = sc.nextInt();

        System.out.println("Enter a num: ");
        num2 = sc.nextInt();

        System.out.println("Enter a num: ");
        num3 = sc.nextInt();

        System.out.println("All numbers entered are ["+num1+", "+num2+", "+num3+"]");

        //Data analyzation
        if(num2>largest){
            largest=num2;
        }
        if (num3>largest){
            largest=num3;
        }

        //Final output of largest num
        System.out.println("Largest number is: "+ largest);

    }
}

