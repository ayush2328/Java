package Questions;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();
        // if (n % 2 == 0) {
        // System.out.printf("%d is even number.", n);
        // } else {
        // System.out.printf("%d is odd.", n);
        // }

        // Logical operator in if else loop
        // if (n % 2 == 0 || n % 3 == 0) {
        // System.out.println("Divisible");
        // } else {
        // System.out.println("Not Divisible.");
        // }

        // Find Maximam out of three using logical operator
        if (n >= o && n >= p) {
            System.out.printf("%d is maximum", n);
        } else if (o >= n && o >= p) {
            System.out.printf("%d is maximum", o);
        } else {
            System.out.printf("%d is maximum", p);
        }

        sc.close();

    }
}
