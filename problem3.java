//package labproblem2.java;
/*
 Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16
 */
import java.util.Scanner;
public class problem3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int divide;
        System.out.println("Enter first number : ");
        int x = input.nextInt();

        System.out.println("Enter Second Number : ");

        int y = input.nextInt();

        divide = x/y;
        System.out.println("divide two Numbers = "+divide);


    }
    
}
