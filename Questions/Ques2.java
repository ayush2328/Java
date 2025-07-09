package Questions;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.printf("%d is even number.", n);
        } else {
            System.out.printf("%d is odd.", n);
        }
        sc.close();

    }
}
