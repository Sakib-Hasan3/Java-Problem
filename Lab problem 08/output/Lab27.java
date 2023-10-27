/*Write a Java program that reads an integer and check whether it is negative, zero, or positive.

Test Data
Input a number: 7
Expected Output :

Number is positive */

import java.util.Scanner;

public class Lab27 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();

        if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
