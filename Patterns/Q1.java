package Patterns;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();

        // Print n "*" in single row
        // for (int i = 0; i < n; i++) {
        // System.out.printf("* ");
        // }

        // Print Square of Star..
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.printf("* ");
        // }
        // System.out.println();
        // }

        // right angle triangle
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < ì̀; j++) {
        // System.out.printf("* ");
        // }
        // System.out.println();
        // }

        // Unique number triangle
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d ", k);
                k++;
            }
            System.out.println();
        }

        sc.close();
    }
}
