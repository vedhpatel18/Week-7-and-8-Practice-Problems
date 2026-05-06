/* 
@author Vedh
*/
import java.util.Scanner;

public class TriangleRun {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sides of triangle
        System.out.print("Enter side 1 (in meters): ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double c = sc.nextDouble();

        // Calculate number of rounds
        double rounds = calculateRounds(a, b, c);

        // Output result
        System.out.println("Number of rounds required to complete 5 km run: " + rounds);
    }

    // Method to calculate rounds
    static double calculateRounds(double a, double b, double c) {

        double perimeter = a + b + c;   // triangle perimeter
        double totalDistance = 5000;    // 5 km = 5000 meters

        return totalDistance / perimeter;
    }
}