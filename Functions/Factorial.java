package Functions;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n) {
        int res = 1;
        while (n >= 1) {
            res = res * n;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        // Basic Factorial Program.
        // int num = sc.nextInt();
        // System.out.printf("%d is the factorial of %d%n", Fact(num), num);

        // Combination Program
        int n = sc.nextInt();
        System.out.printf("Enter the number of combination: ");
        int r = sc.nextInt();
        int nfact = Fact(n);
        int rfact = Fact(r);
        int nmrfact = Fact(n - r);
        int nCr = 0;
        if (r > n) {
            System.out.println("Invaild!, r cannnot be greater than n.");

        } else {
            nCr = nfact / (rfact * nmrfact);
            System.out.printf("The Answer is: %d", nCr);
        }
        System.out.println();
        sc.close();

    }
}
