package Functions;

import java.util.Scanner;

public class Factorial {
    static Scanner sc = new Scanner(System.in);

    public static int Fact(int n) {
        int res = 1;
        while (n >= 1) {
            res = res * n;
            n--;
        }
        return res;
    }

    // Combination Program
    public static void Combination() {
        System.out.printf("%nCombination Program....%n");

        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("Enter the number of combination: ");
        int r = sc.nextInt();
        int nfact = Fact(n);
        int rfact = Fact(r);
        int nmrfact = Fact(n - r);
        int nCr = 0;
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invaild!, r cannnot be greater than n.");

        } else {
            nCr = nfact / (rfact * nmrfact);
            System.out.printf("The Answer is: %d", nCr);
        }
        System.out.println();
    }

    // Permutation Function
    public static void Permutation() {
        System.out.printf("%nPermutaion Program....%n");
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        System.out.printf("Enter the number of combination: ");
        int r = sc.nextInt();
        int nfact = Fact(n);
        int nmrfact = Fact(n - r);
        int nPr = 0;
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invaild!, Syntax.");

        } else {
            nPr = nfact / nmrfact;
            System.out.printf("The Answer is: %d", nPr);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Basic Factorial Program.
        // int num = sc.nextInt();
        // System.out.printf("%d is the factorial of %d%n", Fact(num), num);

        Combination();
        Permutation();

        sc.close();

    }
}
