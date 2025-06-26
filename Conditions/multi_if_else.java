
import java.util.Scanner;

public class multi_if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x < 0) {
            System.out.println("The given number is Negative(-ve).");
        } else if (x == 0) {
            System.out.println("The given Number is Zero(0).");
        } else if (x == 1) {
            System.out.println("The Given Number is One(1).");
        } else if (x % 2 == 0) {
            System.out.printf("The Number is even : %d", x);
        } else {
            System.out.printf("The Number is odd : %d", x);
        }
        sc.close();
    }

}
