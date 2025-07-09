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
        int num = sc.nextInt();
        System.out.printf("%d is the factorial of %d%n", Fact(num), num);

        sc.close();

    }
}
