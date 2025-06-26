import java.util.*;
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        if (x % 2 == 0)
            System.out.printf("%d is even number", x);

        else
            System.out.printf("%d is odd number", x);
        System.out.println();

    }
}
