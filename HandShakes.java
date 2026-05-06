/* 
@author Vedh
*/
import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate handshakes
        int result = calculateHandshakes(numberOfStudents);

        // Output result
        System.out.println("The maximum number of handshakes is: " + result);
    }

    // Method to calculate handshakes using formula
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}