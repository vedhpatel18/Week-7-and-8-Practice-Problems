/* 
@author Vedh
*/
import java.util.Scanner;

public class NaturalSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both results are correct and equal");
        } else {
            System.out.println("Results are not equal");
        }
    }

    static int sumRecursive(int n) {
        if (n == 1)
            return 1;
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}