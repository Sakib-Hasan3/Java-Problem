/*
Write a Java program to compute the area of a hexagon. 
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:

Input the length of a side of the hexagon: 6
The area of the hexagon is: 93.53074360871938
*/

import java.util.Scanner;

public class ex4 {
    
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number of sides on the polygon: ");
        int ns = input.nextInt();
        System.out.print("Input the length of one of the sides: ");
        double side = input.nextDouble();
        System.out.print("The area is: " + polygonArea(ns, side)+"\n");
    }
    public static double polygonArea(int ns, double side) {
        return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
    }
}

