/*
Write a Java program to compute the distance between two points on the surface of earth. Go to the editor

Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers

Input Data:

Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5


The distance between those points is: 1480.0848451069087 km
*/
import java.util.Scanner;

public class ex5 {
    
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = input.nextDouble();

        System.out.print("The distance between those points is: " + distance_Between_LatLong(lat1, lon1, lat2, lon2) + " km\n");
    }

    
    public static double distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; 
        return earthRadius * Math.acos(Math.sin(lat1)*Math.sin(lat2) + Math.cos(lat1)*Math.cos(lat2)*Math.cos(lon1 - lon2));
    }
}


