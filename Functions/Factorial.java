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

        System.out.printf("Enter value of n: ");
        int n = sc.nextInt();
        System.out.printf("Enter value of r: ");
        int r = sc.nextInt();
        int nfact = Fact(n);
        int rfact = Fact(r);
        int nmrfact = Fact(n - r);
        int nCr = 0;
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! 'r' cannot be greater than 'n', and both must be ≥ 0.");

        } else {
            nCr = nfact / (rfact * nmrfact);
            System.out.printf("The Answer is: %d", nCr);
        }
        System.out.println();
    }

    // Permutation Function
    public static void Permutation() {
        System.out.printf("%nPermutaion Program....%n");
        System.out.printf("Enter value of n: ");
        int n = sc.nextInt();
        System.out.printf("Enter value of r: ");
        int r = sc.nextInt();
        int nfact = Fact(n);
        int nmrfact = Fact(n - r);
        int nPr = 0;
        if (r > n || n < 0 || r < 0) {
            System.out.println("Invalid input! 'r' cannot be greater than 'n', and both must be ≥ 0.");

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
        while (true) {

            System.out.println("**-----Welcome-*-to-*-Ayush-*-MathsLab-----**");
            System.out.println("1. Factorial");
            System.out.println("2. Combination");
            System.out.println("3. Permutation");
            System.out.println("4. Exit");

            System.out.printf("Enter the option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Enter a value: ");
                    int n = sc.nextInt();
                    int res = Fact(n);
                    System.out.printf("%d is factorial of %d%n", res, n);
                    break;
                case 2:
                    Combination();
                    break;
                case 3:
                    Permutation();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Chooice");
                    break;
            }

        }

    }
}
