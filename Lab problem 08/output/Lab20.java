/* Write a Java program to print Floyd's Triangle.

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 */

import java.util.Scanner;

public class Lab20 
{
  public static void main(String[] args)
 {
   int numberOfRows;
   System.out.print("Input number of rows : ");
   Scanner in = new Scanner(System.in);
		    numberOfRows = in.nextInt();
   int number = 1;
   for (int row = 1; row <= numberOfRows; row++)
    {
   for (int column = 1; column <= row; column++)
     {
       System.out.print(number + " ");
       number++;
     }
     System.out.println();
    }
  }  
}
