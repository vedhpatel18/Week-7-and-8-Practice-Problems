/* 
@author Vedh
*/
import java.util.Scanner;

public class FactorsProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get factors array
        int[] factors = getFactors(num);

        // Display factors
        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        // Calculations
        int sum = getSum(factors);
        long product = getProduct(factors);
        double sumOfSquares = getSumOfSquares(factors);

        // Output results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

    // Method to find factors and return array
    static int[] getFactors(int num) {

        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];

        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum
    static int getSum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Method to find product
    static long getProduct(int[] arr) {
        long product = 1;
        for (int x : arr) {
            product *= x;
        }
        return product;
    }

    // Method to find sum of squares
    static double getSumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }
}